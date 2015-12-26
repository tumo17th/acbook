package com.acbook.apiserver.common;

import static com.acbook.common.consts.ACBookConst.CRLF;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.acbook.common.context.ACBookContext;

public class ACBookContextLoaderListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        System.out.println(CRLF + "----- ACBook Context Initialize Start -----" + CRLF);
        ACBookContext.initialize();
        System.out.println(CRLF + "----- ACBook Context Initialize Finish -----" + CRLF);
    }

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
    }

}
