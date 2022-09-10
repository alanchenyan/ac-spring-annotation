package com.ac.annotation.demo.configures.life.three;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Alan Chen
 * @description
 * @date 2022/9/8
 */
public class AoDiCar {

    @PostConstruct
    public void start() {
        System.out.println("奥迪汽车启动......");
    }

    public void run() {
        System.out.println("奥迪汽车行驶中......");
    }

    @PreDestroy
    public void stop() {
        System.out.println("奥迪汽车熄火......");
    }
}
