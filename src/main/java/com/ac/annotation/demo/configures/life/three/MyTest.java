package com.ac.annotation.demo.configures.life.three;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Alan Chen
 * @description
 * @date 2022/9/8
 */
public class MyTest {

    @Test
    public void test(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(LifeThreeConfig.class);
        AoDiCar bean = app.getBean(AoDiCar.class);
        bean.run();

        //关闭content，会调用bean的destroyMethod
        app.close();
    }
}
