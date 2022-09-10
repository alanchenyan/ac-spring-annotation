package com.ac.annotation.demo.configures.componentscan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

/**
 * @author Alan Chen
 * @description
 * @date 2022-09-06
 */
@Configuration
@ComponentScan(
        value = "com.ac.annotation.demo.configures.componentscan",
        includeFilters={@ComponentScan.Filter(type= FilterType.CUSTOM,value= MyScanFilter.class)},
        useDefaultFilters=false)
@Component
public class MyComponentScan5 {
    // 自定义过滤规则
}
