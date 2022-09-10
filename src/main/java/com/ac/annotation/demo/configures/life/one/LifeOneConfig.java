package com.ac.annotation.demo.configures.life.one;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alan Chen
 * @description
 * @date 2022/9/8
 */
@Configuration
public class LifeOneConfig {

    @Bean(initMethod = "start",destroyMethod = "stop")
    public BaoMaCar baoMaCar(){
        return new BaoMaCar();
    }
}
