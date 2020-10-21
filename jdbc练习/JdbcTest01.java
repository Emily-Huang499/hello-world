package com.emilytest.util;

import java.sql.*;

public class JdbcTest01 {
    public static void main(String[] args) {
        try {
            Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);

            String url = "jdbc:mysql://127.0.0.1:3306/emilytest";
            String user = "root";
            String password = "1130";

            Connection conn = DriverManager.getConnection(url,user,password);
            System.out.println("数据库连接对象= " + conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}