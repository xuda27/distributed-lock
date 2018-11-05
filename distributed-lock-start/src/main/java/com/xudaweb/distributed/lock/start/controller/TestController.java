package com.xudaweb.distributed.lock.start.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuda
 * @date 2018/10/22
 */
@RestController
public class TestController {

    @GetMapping("/aa")
    public String test() {
        return "aa";
    }
}
