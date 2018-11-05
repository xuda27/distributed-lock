package com.xudaweb.distributed.lock.start.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuda
 * @date 2018/10/28
 */
public class Java8Test2 {
    public static void main(String args[]){
        List names = new ArrayList();

        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");

        names.forEach(System.out::println);
    }
}
