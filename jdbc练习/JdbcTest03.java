package com.emilytest.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest03 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emilytest?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC","root","1130");

            stmt = conn.createStatement();

            String sql = "update dept set dname ='人事部',loc = '北京' where deptno = 40";

            int count = stmt.executeUpdate(sql);

            System.out.println(count == 1 ?"更新成功":"更新失败");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
