package com.ac.annotation.demo.injections.service;

import org.springframework.stereotype.Service;

/**
 * @author Alan Chen
 * @description
 * @date 2022-09-09
 */
@Service
public class MyService {

    //如果是业务层组件，则用此注解，同样会被注册到IOC容器中
}
