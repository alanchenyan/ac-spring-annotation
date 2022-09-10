package com.ac.annotation.demo.configures.import2;

/**
 * @author Alan Chen
 * @description
 * @date 2022/9/8
 */
public class UserComponent {

    public void run(String str) {
        System.out.println(str);
    }

    public void printName() {
        System.out.println("类名 ：" + Thread.currentThread().getStackTrace()[1].getClassName());
    }
}
