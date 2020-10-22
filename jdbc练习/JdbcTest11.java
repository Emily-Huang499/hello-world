package com.emilytest.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcTest11 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emilytest?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC","root","1130");
            String sql = "delete from dept where dname = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"销售部");
            int count = ps.executeUpdate();
            System.out.println(count == 1 ? "删除成功" : "删除失败");
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
