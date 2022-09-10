package com.ac.annotation.demo.injections.primary;

/**
 * @author Alan Chen
 * @description
 * @date 2022/9/9
 */
public class SchoolComponent {

    private String name;

    public SchoolComponent() {
    }

    public SchoolComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SchoolComponent{" +
                "name='" + name + '\'' +
                '}';
    }
}
