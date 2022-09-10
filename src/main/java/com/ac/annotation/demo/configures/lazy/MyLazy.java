package com.ac.annotation.demo.configures.lazy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @author Alan Chen
 * @description
 * @date 2022-09-07
 */
@Configuration
public class MyLazy {

    @Bean
    public Dog normalDog() {
        System.out.println("将normalDog添加到IOC容器中");
        return new Dog("灰灰", 1);
    }

    @Lazy
    @Bean
    public Dog lazyDog() {
        //延迟加载，调用此对象时才会去创建
        System.out.println("将lazyDog添加到IOC容器中");
        return new Dog("毛毛", 2);
    }
}
