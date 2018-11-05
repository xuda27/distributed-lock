package com.xudaweb.distributed.lock.start;

import sun.misc.Launcher;

/**
 *
 * @see Launcher
 * @author xuda
 * @date 2018/10/18
 */
public class TestClassLoader {
    public static void main(String[] args) {
        //bootStrap 类加载目录
        System.out.println(System.getProperty("sun.boot.class.path"));
        //ext 类加载目录
        System.out.println(System.getProperty("java.ext.dirs"));
        //app 类加载目录
        System.out.println(System.getProperty("java.class.path"));

        String time = "2019-10-10 12:12:13.0";
        System.out.println(time.substring(0, time.length()-2));
    }
}
