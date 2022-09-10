package com.ac.annotation.demo.injections.repository;

import org.springframework.stereotype.Repository;

/**
 * @author Alan Chen
 * @description
 * @date 2022-09-09
 */
@Repository
public class MyDao {

    // 如果是数据访问层组件，则用此注解，同样会被注册到IOC容器中
}
