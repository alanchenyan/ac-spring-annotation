package com.ac.annotation.demo.configures.lazy;

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
        ApplicationContext app = new AnnotationConfigApplicationContext(MyLazy.class);
        System.out.println("IOC容器已创建---------------");

        Object bean1 = app.getBean("normalDog");
        Object bean2 = app.getBean("lazyDog");

        System.out.println(bean1 == bean2);
    }
}
