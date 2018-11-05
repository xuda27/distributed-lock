package com.xudaweb.distributed.lock.start;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * jdbc加载驱动 spi
 * @author xuda
 * @date 2018/10/18
 */
public class TestJdbc {
    public static  void main(String[] args) {
        //加载驱动
        //获取连接
        String url = "jdbc:mysql://localhost:3306/sakila?user=root&password=12345678";
        try {
            Connection con = DriverManager.getConnection(url);
            if (con != null) {
                System.out.println("连接成功！");
            }
        } catch (SQLException e) {
            System.out.println("连接失败！");
            e.printStackTrace();
        }
    }

}
