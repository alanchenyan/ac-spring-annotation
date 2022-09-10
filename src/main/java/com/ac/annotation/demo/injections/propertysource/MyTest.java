package com.ac.annotation.demo.injections.propertysource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author Alan Chen
 * @description
 * @date 2022-08-30
 */
public class MyTest {

    @Test
    public void test() {
        ApplicationContext app = new AnnotationConfigApplicationContext(MyPropertySourceConfig.class);
        System.out.println("IoC容器创建完成");

        // 从环境变量中取值
        Environment env = app.getEnvironment();
        String address = env.getProperty("player.address");
        System.out.println(address);
    }
}
