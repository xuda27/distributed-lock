package com.xudaweb.distributed.lock.start;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xuda
 * @date 2018/10/22
 */
public class ThreadPool {
    static volatile int j = 0;
    Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        ThreadPool threadPool = new ThreadPool();
        ExecutorService pool = Executors.newCachedThreadPool();
        for (int i = 0; i < 1000; i++) {
            pool.execute(() -> {
                threadPool.increase();
            });
        }
        System.out.println(j);
        pool.shutdown();
        while (true) {
            if (pool.isTerminated()) {
                System.out.println("所有的子线程都结束了！");
                break;
            }
        }
    }

    synchronized void increase() {
        ++j;
    }

}
