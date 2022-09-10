package com.ac.annotation.demo.configures.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author Alan Chen
 * @description
 * @date 2022/9/7
 */
@Configuration
public class MyScope {

    @Scope("singleton")
    @Bean
    public Boss singletonBoss() {
        return new Boss("AlanChen", 18);
    }

    @Scope("prototype")
    @Bean
    public Boss prototypeBoss() {
        return new Boss("AC", 30);
    }
}
