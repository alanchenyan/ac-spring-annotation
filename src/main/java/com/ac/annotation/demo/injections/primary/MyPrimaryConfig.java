package com.ac.annotation.demo.injections.primary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author Alan Chen
 * @description
 * @date 2022/9/9
 */
@Configuration
@ComponentScan
public class MyPrimaryConfig {

    //使用当前实例
    @Primary
    @Bean("schoolComponent")
    public SchoolComponent schoolComponent() {
        return new SchoolComponent("清华");
    }

    @Bean("schoolComponent")
    public SchoolComponent schoolComponent2() {
        return new SchoolComponent("北大");
    }
}
