package com.xudaweb.distributed.lock.start.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xudaweb.distributed.lock.service.DubboTestService;
import com.xudaweb.distributed.lock.start.query.TestQuery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuda
 * @date 2018/10/22
 */
@RestController
public class TestController {

    @Reference
    private DubboTestService dubboTestService;

    @GetMapping("/aa")
    public String test() {
        return "aa";
    }

    @GetMapping("/testDubbo")
    public String testDubbo() {
        return dubboTestService.say();
    }

    public static void main(String[] args) {
        long a ;
    }

    @PostMapping("/bb")
    public String testFormat(TestQuery testQuery) {
        return "aa";
    }
}
