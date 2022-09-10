package com.ac.annotation.demo.injections.value;

import com.ac.annotation.demo.configures.lazy.MyLazy;
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
        ApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);

        Player player = app.getBean(Player.class);
        System.out.println(player);
    }
}
