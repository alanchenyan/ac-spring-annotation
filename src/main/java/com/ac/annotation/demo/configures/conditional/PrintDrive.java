package com.ac.annotation.demo.configures.conditional;

/**
 * @author Alan Chen
 * @description
 * @date 2022-09-08
 */
public class PrintDrive {

    private String os;

    private String name;

    public PrintDrive() {
    }

    public PrintDrive(String os, String name) {
        this.os = os;
        this.name = name;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PrintDrive{" +
                "os='" + os + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
