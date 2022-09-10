package com.ac.annotation.demo.injections.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Alan Chen
 * @description
 * @date 2022-09-09
 */
@Component
public class Player {

    //支持基本数据类型
    @Value("AlanChen")
    private String name;

    //通过@PropertySource("classpath:values.properties")读取配置文件取值
    @Value("${player.address}")
    private String address;

    //支持Spring EL表达式
    @Value("#{2022-1990}")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
