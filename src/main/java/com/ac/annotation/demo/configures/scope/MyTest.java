package com.ac.annotation.demo.configures.scope;

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
        ApplicationContext app = new AnnotationConfigApplicationContext(MyScope.class);

        System.out.println("singleton测试---------------");
        Object bean1 = app.getBean("singletonBoss");
        Object bean2 = app.getBean("singletonBoss");
        System.out.println(bean1 == bean2);

        System.out.println("prototype测试---------------");
        Object bean3 = app.getBean("prototypeBoss");
        Object bean4 = app.getBean("prototypeBoss");
        System.out.println(bean3 == bean4);
    }
}
