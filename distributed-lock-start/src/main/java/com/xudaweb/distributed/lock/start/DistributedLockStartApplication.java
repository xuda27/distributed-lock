package com.xudaweb.distributed.lock.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class DistributedLockStartApplication {

    public static void main(String[] args) {
        // start embedded zookeeper server
//        new EmbeddedZooKeeper(2181, false).start();
        SpringApplication.run(DistributedLockStartApplication.class, args);
    }
}
