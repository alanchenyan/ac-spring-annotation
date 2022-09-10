package com.ac.annotation.demo.injections.propertysource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Alan Chen
 * @description
 * @date 2022-09-06
 */
@Configuration
@ComponentScan
@PropertySource("classpath:values.properties")
public class MyPropertySourceConfig {
    // @ComponentScan注解在某类上时会扫描该类所在包下的所有类
}
