package com.xudaweb.distributed.lock.service.impl;

import com.xudaweb.distributed.lock.service.MQService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


//@Service
public class KafkaServiceImpl implements MQService {


    @KafkaListener(topics = "maxwell")
    @Override
    public void processMessage(String content) {
        System.out.println(content);

    }
}
