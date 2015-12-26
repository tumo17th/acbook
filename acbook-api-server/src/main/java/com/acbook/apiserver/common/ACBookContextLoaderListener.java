package com.acbook.apiserver.common;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.acbook.common.context.ACBookContext;

public class ACBookContextLoaderListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        System.out.println("----- ACBook Context Initialize Start -----");
        ACBookContext.initialize();
        System.out.println("----- ACBook Context Initialize Finish -----");
    }

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
    }

}
