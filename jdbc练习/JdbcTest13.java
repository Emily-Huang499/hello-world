package com.emilytest.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcTest13 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emilytest?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC","root","1130");

            conn.setAutoCommit(false);

            String sql = "update dept set dname =?,loc =? where deptno=?";
            ps = conn.prepareStatement(sql);

            ps.setString(1,"销售部");
            ps.setString(2,"西安");
            ps.setInt(3,40);
            int count = ps.executeUpdate();

//            String s = null;
//            s.toString();

            ps.setString(1,"销售部");
            ps.setString(2,"南昌");
            ps.setInt(3,10);
            count += ps.executeUpdate();

            System.out.println(count == 2 ? "更新成功" : "更新失败");
            conn.commit();
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
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
