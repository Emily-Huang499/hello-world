package com.emilytest.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcTest14 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emilytest?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC","root","1130");

            String sql = "update dept set dname =?,loc =? where deptno=?";
            ps = conn.prepareStatement(sql);

            ps.setString(1,"售楼部");
            ps.setString(2,"香港");
            ps.setInt(3,60);
            int count = ps.executeUpdate();

            String s = null;
            s.toString();

            ps.setString(1,"财务部");
            ps.setString(2,"南昌");
            ps.setInt(3,10);
            count += ps.executeUpdate();

            System.out.println(count == 2 ? "更新成功" : "更新失败");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null){
                try {
                    ps.close();
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
