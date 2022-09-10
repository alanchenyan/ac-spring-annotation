package com.ac.annotation.demo.configures.life.four;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Alan Chen
 * @description
 * @date 2022/9/8
 */
public class MyTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(LifeFourConfig.class);
        System.out.println("IOC容器创建完成");

        //关闭content，会调用bean的destroyMethod
        app.close();
    }
}
