package com.ac.annotation.demo.configures.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author Alan Chen
 * @description
 * @date 2022-09-08
 */
public class WindowsCondition implements Condition {

    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        String osName = environment.getProperty("os.name");
        System.out.println("WindowsCondition，当前系统环境为："+osName);
        if (osName.contains("Windows")) {
            return true;
        }
        return false;
    }
}
