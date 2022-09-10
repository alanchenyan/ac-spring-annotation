package com.ac.annotation.demo.injections.primary;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Alan Chen
 * @description
 * @date 2022-08-30
 */
public class MyTest {

    @Test
    public void test(){
        ApplicationContext app = new AnnotationConfigApplicationContext(MyPrimaryConfig.class);

        Object bean = app.getBean("schoolComponent");
        System.out.println(bean);
    }
}
