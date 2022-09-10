package com.ac.annotation.demo.configures.life.four;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alan Chen
 * @description
 * @date 2022/9/8
 */
@Configuration
public class MyBeanPostProcessor implements BeanPostProcessor {

    /**
     * 重写接口
     */
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println(beanName);
        if (bean instanceof FuTeCar) {
            FuTeCar fuTeCar = (FuTeCar) bean;
            fuTeCar.start();
        }
        return bean;
    }

    /**
     * 重写接口
     */
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        if (bean instanceof FuTeCar) {
            FuTeCar fuTeCar = (FuTeCar) bean;
            fuTeCar.run();
        }
        return bean;
    }
}
