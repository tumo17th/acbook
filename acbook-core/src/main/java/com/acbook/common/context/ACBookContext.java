package com.acbook.common.context;

import static com.acbook.common.consts.ACBookConst.CRLF;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acbook.common.config.ACBookConfig;
import com.acbook.model.dao.IDao;
import com.acbook.service.ExpenseService;
import com.acbook.service.IService;

/**
 * Manage all instances of acbook-core by loading ApplicationContext (provided by Spring).
 * All access such as getting Services and getting Config properties is done via this class.
 * 
 * ApplicationContext (provided by Spring)をloadして、acbook-coreのインスタンス管理全体を司るクラス
 * Serviceの取得、Configの取得などは、全てこのクラスを通して行う
 * 
 * @author tumo
 */
public class ACBookContext {

    /** All instances in acbook-core loaded by Spring */
    private static ApplicationContext appCtx;

    /** All config properties in acbook-core */
    private static ACBookConfig acbookConfig;

    // Initialize //////////////////////////////////////////////////////////////////////////////////////////////////////
    /** Initialize ACBookContext >> Create all instances of acbook-core */
    public static void initialize() {
        appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
        acbookConfig = appCtx.getBean(ACBookConfig.class);

        initializeServices();
    }

    /** Initialize all Services >> Inject all Dao instances. */
    private static void initializeServices() {
        System.out.println(CRLF + "Initialize ACBook Services...");
        Map<String, IService> serviceMap = appCtx.getBeansOfType(IService.class);
        serviceMap.values().stream().forEach(iservice -> {
            iservice.initialize();
            System.out.println(iservice);
        });
    }

    // Get Services ////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Get ExpenseService instance.
     * @return ExpenseService instance.
     */
    public static ExpenseService getExpenseService() {
        return appCtx.getBean(ExpenseService.class);
    }

    // Get Dao /////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Get Configured Dao Instance. (ex DaoMoc, DaoDerby, DaoMySQL)
     * @param clazz Dao Interface
     * @return Dao Instance
     */
    public static IDao getDao(Class<? extends IDao> clazz) {
        return appCtx.getBean(clazz.getSimpleName() + acbookConfig.getDaoType(), clazz);
    }

    // Close ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void close() {
        ((ClassPathXmlApplicationContext)appCtx).close();
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
