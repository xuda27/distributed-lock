package com.xudaweb.distributed.lock.service;

public interface MQService {
    void processMessage(String content);
}
