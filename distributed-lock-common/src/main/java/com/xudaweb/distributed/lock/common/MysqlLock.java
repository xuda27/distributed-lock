package com.xudaweb.distributed.lock.common;

import com.xudaweb.distributed.lock.dal.dao.ResourceLockMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author xuda
 * @date 2018/10/13
 */
public class MysqlLock implements Lock {
    @Autowired
    private ResourceLockMapper resourceLockMapper;

    @Override
    public void lock() {
        try {
            this.lockInterruptibly();
        } catch (InterruptedException var2) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {

    }

    @Override
    public Condition newCondition() {
        throw new UnsupportedOperationException();
    }
}
