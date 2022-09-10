package com.ac.annotation.demo.injections.resource;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Alan Chen
 * @description
 * @date 2022-09-09
 */
@Service
public class UserAddressService {

    @Resource(name = "address")
    private UserAddressDao userAddressDao;
}
