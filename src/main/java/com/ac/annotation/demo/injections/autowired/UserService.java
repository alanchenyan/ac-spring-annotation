package com.ac.annotation.demo.injections.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Alan Chen
 * @description
 * @date 2022/9/9
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;
}
