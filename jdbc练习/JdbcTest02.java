package com.emilytest.util;

import java.sql.*;

public class JdbcTest02 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt =null;

        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emilytest?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC","root","1130");

            stmt = conn.createStatement();

            String sql = "delete from dept where deptno = 10";

            int count = stmt.executeUpdate(sql);

            System.out.println(count == 1? "删除成功": "删除失败");
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
