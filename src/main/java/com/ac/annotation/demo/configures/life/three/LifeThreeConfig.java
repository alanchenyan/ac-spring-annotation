package com.ac.annotation.demo.configures.life.three;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alan Chen
 * @description
 * @date 2022/9/8
 */
@Configuration
public class LifeThreeConfig {

    @Bean
    public AoDiCar aoDiCar(){
        return new AoDiCar();
    }
}
