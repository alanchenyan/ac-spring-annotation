package com.ac.annotation.demo.configures.import2;

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
        ApplicationContext app = new AnnotationConfigApplicationContext(MyImport.class);
        UserEntity bean = app.getBean(UserEntity.class);
        bean.printName();
        bean.run("run userEntity");
    }

    @Test
    public void test2(){
        ApplicationContext app = new AnnotationConfigApplicationContext(MyImport.class);
        UserConfig bean = app.getBean(UserConfig.class);
        bean.printName();
        bean.run("run UserConfig");
    }

    @Test
    public void test3(){
        ApplicationContext app = new AnnotationConfigApplicationContext(MyImport.class);
        UserComponent bean = app.getBean(UserComponent.class);
        bean.printName();
        bean.run("run UserComponent");
    }

    @Test
    public void test4(){
        ApplicationContext app = new AnnotationConfigApplicationContext(MyImport.class);
        UserDao bean = app.getBean(UserDao.class);
        bean.printName();
        bean.run("run UserDao");
    }
}
