package com.ac.annotation.demo.injections.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author Alan Chen
 * @description
 * @date 2022/9/9
 */
@Service
public class StudentService {

    @Qualifier("dao")
    @Autowired
    private StudentDao studentDao;
}
