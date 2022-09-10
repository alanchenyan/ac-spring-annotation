package com.ac.annotation.demo.configures.life.two;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alan Chen
 * @description
 * @date 2022/9/8
 */
@Configuration
public class LifeTwoConfig {

    @Bean
    public BenChiCar benChiCar(){
        return new BenChiCar();
    }
}
