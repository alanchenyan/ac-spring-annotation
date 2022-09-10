package com.ac.annotation.demo.configures.life.two;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Alan Chen
 * @description
 * @date 2022/9/8
 */
public class BenChiCar implements InitializingBean, DisposableBean {

    /**
     * 重写接口方法
     */
    public void destroy() {
        stop();
    }

    /**
     * 重写接口方法
     */
    public void afterPropertiesSet() {
        start();
    }

    public void start() {
        System.out.println("奔驰汽车启动......");
    }

    public void run() {
        System.out.println("奔驰汽车行驶中......");
    }

    public void stop() {
        System.out.println("奔驰汽车熄火......");
    }
}
