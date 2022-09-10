package com.ac.annotation.demo.configures.componentscan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alan Chen
 * @description
 * @date 2022-09-06
 */
@Configuration
@ComponentScan("com.ac.annotation.demo.configures.componentscan")
public class MyComponentScan2 {
    // 定义了包路径的话就扫描该路径下的所有组件,记住是组件，不是所有类，比如`@Controller`、`@Service`、`@Repository`这种，或者`@Component`这种。
}
