package com.xudaweb.distributed.lock.service.test;

import java.io.Serializable;

/**
 * @author xuda
 * @date 2018/10/22
 */
public class TestDO implements Serializable {
    private static final long serialVersionUID = -7373437405793271204L;
    private String test;

    public TestDO(String test){
        this.test = test;
    }
    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "TestDO:test = " + test;
    }
}
