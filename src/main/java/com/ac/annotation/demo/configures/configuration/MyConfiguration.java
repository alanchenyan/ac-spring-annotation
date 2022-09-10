package com.ac.annotation.demo.configures.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alan Chen
 * @description
 * @date 2022-08-30
 */
@Configuration
public class MyConfiguration {

    /**
     * 1、只会调用一次，注入拿到的Cat都是同一个
     * 2、默认用方法名作为bean的key，获取bean时，默认用方法名cat
     * @return
     */
    @Bean
    public Cat cat(){
        return new Cat("小花猫",2);
    }

    /**
     * 1、只会调用一次
     * 2、自定义bean的key，设置value值为duck
     * @return
     */
    @Bean("duck")
    public Duck duck2(){
        return new Duck("唐老鸭",1);
    }
}
