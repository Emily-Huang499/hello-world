package com.emilytest.util;

import java.sql.*;
import java.util.ResourceBundle;

public class JdbcTest06 {
    public static void main(String[] args) {
        ResourceBundle bundle =ResourceBundle.getBundle("jdbc");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(driver);

            conn = DriverManager.getConnection(url,user,password);

            stmt = conn.createStatement();

            String sql = "select * from dept";

            rs = stmt.executeQuery(sql);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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
