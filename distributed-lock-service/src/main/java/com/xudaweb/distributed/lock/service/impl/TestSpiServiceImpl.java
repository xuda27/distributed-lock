package com.xudaweb.distributed.lock.service.impl;

import com.xudaweb.distributed.lock.service.TestSpiService;

/**
 * @author xuda
 * @date 2018/10/18
 */
public class TestSpiServiceImpl implements TestSpiService {
    @Override
    public void sayHello() {
        System.out.println("hello world");
    }
}
