package com.bjpowernode.util;

import java.sql.*;

public class JdbcUtil {
    private static String driverName = "com.mysql.jdbc.Driver";
    final String url = "jdbc:mysql://localhost:3305/new_schema";
    final String username = "root";
    final String password = "hywshmily1110";
    PreparedStatement ps = null;
    Connection con = null;

    static{
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getCon(){
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public PreparedStatement createStatement(String sql){
        try {
            ps = getCon().prepareStatement((String) sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return ps;
    }
    public void close(){
        if(con != null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void close(PreparedStatement ps){
        if(ps != null){
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void close(ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

