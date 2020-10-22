package com.emilytest.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class JdbcTest05 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");

        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(driver);

            conn = DriverManager.getConnection(url,user,password);

            stmt = conn.createStatement();

            String sql = "insert into dept(deptno,dname,loc) value(20,'人事部','厦门')";

            int count = stmt.executeUpdate(sql);

            System.out.println(count == 1 ? "保存成功" : "保存失败");
        } catch (Exception e) {
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
