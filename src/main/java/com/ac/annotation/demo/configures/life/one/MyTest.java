package com.ac.annotation.demo.configures.life.one;

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
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(LifeOneConfig.class);
        BaoMaCar bean = app.getBean(BaoMaCar.class);
        bean.run();

        //关闭content，会调用bean的destroyMethod
        app.close();
    }
}
