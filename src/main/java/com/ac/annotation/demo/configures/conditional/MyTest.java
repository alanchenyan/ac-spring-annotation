package com.ac.annotation.demo.configures.conditional;

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
        ApplicationContext app = new AnnotationConfigApplicationContext(MyConditional.class);
        System.out.println("IOC容器已创建---------------");

        PrintDrive drive = app.getBean(PrintDrive.class);
        System.out.println(drive);
    }
}
