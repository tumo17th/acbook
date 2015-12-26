package com.acbook.common.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ACBookContext {

    private static ApplicationContext appCtx;

    public static void initialize() {
        appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    public static ApplicationContext getContext() {
        return appCtx;
    }

    public static void close() {
        ((ClassPathXmlApplicationContext)appCtx).close();
    }

}
