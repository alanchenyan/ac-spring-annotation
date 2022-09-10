package com.ac.annotation.demo.configures.configuration;

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
        ApplicationContext app = new AnnotationConfigApplicationContext(MyConfiguration.class);

        System.out.println("默认用方法名取bean---------------");
        //默认用方法名取bean
        Object bean1 = app.getBean("cat");
        Object bean2 = app.getBean("cat");

        //注入拿到的Cat都是同一个
        Boolean e = bean1 == bean2;

        System.out.println(bean1);
        System.out.println(bean2);
        System.out.println(e);

        System.out.println();
        System.out.println("用class type取bean---------------");
        //用class type取bean
        Cat cat = app.getBean(Cat.class);
        System.out.println(cat);
        System.out.println(bean1==cat);

        System.out.println();
        System.out.println("用自定义key取bean---------------");
        Object duck = app.getBean("duck");
        System.out.println(duck);
    }
}
