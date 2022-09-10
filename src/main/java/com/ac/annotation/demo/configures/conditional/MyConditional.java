package com.ac.annotation.demo.configures.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alan Chen
 * @description
 * @date 2022-09-08
 */
@Configuration
public class MyConditional {

    @Conditional(WindowsCondition.class)
    @Bean("printDrive")
    public PrintDrive windowsDrive(){
        System.out.println("创建windows打印驱动");
       return new PrintDrive("windows","windows打印驱动");
    }

    @Conditional(LinuxCondition.class)
    @Bean("printDrive")
    public PrintDrive linuxDrive(){
        System.out.println("创建linux打印驱动");
        return new PrintDrive("linux","linux打印驱动");
    }
}
