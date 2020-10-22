package com.emilytest.util;

import java.sql.*;
import java.util.ResourceBundle;
import java.util.Scanner;

public class JdbcTest09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入desc或asc,desc表示降序，asc表示升序");
        System.out.print("请输入：");
        String keywords = s.next();

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");

        try {
            conn = DriverManager.getConnection(url,user,password);

            stmt = conn.createStatement();

            String sql = "select deptno from dept order by deptno " + keywords;

            rs = stmt.executeQuery(sql);

            while (rs.next()){
                System.out.println(rs.getInt("deptno"));
            }
        } catch (SQLException e) {
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
}
