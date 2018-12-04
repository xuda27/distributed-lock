package com.xudaweb.distributed.lock.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class},
        scanBasePackages = {"com.xudaweb.distributed.lock.*"})
public class DistributedLockStartApplication {

    public static void main(String[] args) {
        // start embedded zookeeper server
//        new EmbeddedZooKeeper(2181, false).start();
        SpringApplication.run(DistributedLockStartApplication.class, args);
    }
}
