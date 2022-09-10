package com.ac.annotation.demo.configures.componentscan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alan Chen
 * @description
 * @date 2022-09-06
 */
@Configuration
@ComponentScan
public class MyComponentScan {
    // 注解在某类上时会扫描该类所在包下的所有类
}
