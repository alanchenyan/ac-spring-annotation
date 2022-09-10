package com.ac.annotation.demo.configures.life.four;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alan Chen
 * @description
 * @date 2022/9/8
 */
@Configuration
@ComponentScan
public class LifeFourConfig {

    @Bean
    public FuTeCar fuTeCar() {
        return new FuTeCar();
    }
}
