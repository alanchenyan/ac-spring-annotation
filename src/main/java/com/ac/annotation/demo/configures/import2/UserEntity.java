package com.ac.annotation.demo.configures.import2;

/**
 * 注意：这是一个普通Java类，没有任何注解
 * @author AlanChen
 */
public class UserEntity {

    public void run(String str) {
        System.out.println(str);
    }

    public void printName() {
        System.out.println("类名 ：" + Thread.currentThread().getStackTrace()[1].getClassName());
    }
}
