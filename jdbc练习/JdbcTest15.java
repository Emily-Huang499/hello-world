package com.emilytest.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTest15 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            String sql = "select dname from dept where dname like ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"_事%");
            rs = ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString("dname"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn,ps,rs);
        }
    }
}
