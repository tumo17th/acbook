package com.acbook.apiserver.common;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ACBookContextLoaderListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        System.out.println("----- Start Context Initialize -----");
        // ACBookConfig config = new ACBookConfig();
        // System.out.println(config.getTest());
    }

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
    }

}
