package com.xudaweb.distributed.lock.service.test;

import com.xudaweb.distributed.lock.service.TestSpiService;

import java.io.*;
import java.util.ServiceLoader;

/**
 * @author xuda
 * @date 2018/10/18
 */
public class Test {
    public static void main(String[] args) {
        ServiceLoader<TestSpiService> spiSerivces = ServiceLoader.load(TestSpiService.class);
//        for(TestSpiService spiSerivce : spiSerivces) {
//            spiSerivce.sayHello();
//        }

        //序列化
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/Users/xuda/a.txt"))) {
//            objectOutputStream.writeObject(new TestDO("aa"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //反序列化
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/Users/xuda/a.txt"));
            TestDO testDO = (TestDO) objectInputStream.readObject();
            System.out.println(testDO.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
