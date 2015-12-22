package com.acbook.config;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class ACBookConfigTest extends TestCase {

    @Test
    public void testRunACBookConfig() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(ctx.getBean(ACBookConfig.class).getTest());
        ((ClassPathXmlApplicationContext)ctx).close();
    }

}
