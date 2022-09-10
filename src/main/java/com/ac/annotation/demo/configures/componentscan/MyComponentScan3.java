package com.ac.annotation.demo.configures.componentscan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author Alan Chen
 * @description
 * @date 2022-09-06
 */
@Configuration
@ComponentScan(
        value = "com.ac.annotation.demo.configures.componentscan",
        includeFilters={@ComponentScan.Filter(type= FilterType.ANNOTATION,value= Controller.class)},
        useDefaultFilters=false)
public class MyComponentScan3 {
    // 只扫描配置了指定注解的类，比如配置了@Controller注解的类
}
