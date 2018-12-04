package com.xudaweb.distributed.lock.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xudaweb.distributed.lock.service.DubboTestService;

//@Service(interfaceName = "dubboTest")
public class DubboTestServiceImpl implements DubboTestService {
    @Override
    public String say() {
        return "Hello";
    }
}
