package com.ac.annotation.demo.configures.componentscan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @author Alan Chen
 * @description
 * @date 2022-09-06
 */
@Configuration
@ComponentScan(
        value = "com.ac.annotation.demo.configures.componentscan",
        useDefaultFilters = false,
        includeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {PersonVO.class, Person.class, Worker.class})}
)
public class MyComponentScan4 {
    // 扫描指定的类型
    // 注意：PersonVO只是一个普通的java类，没有任何注解，但也能被扫描出来
}
