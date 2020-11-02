package com.emily.util;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.sql.*;
import java.util.Map;

public class JdbcUtil {
    //这个工具类,主要为我们获取一个数据库连接
    private static String driverName = "com.mysql.jdbc.Driver";
    final String url = "jdbc:mysql://localhost:3306/emilytest?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC";
    final String username = "root";
    final String password = "1130";
    PreparedStatement ps = null;
    Connection con = null;

    //静态代码块,目的,让第一次使用到JDBCUtils中加载驱动,第二次以后不再加载了
    static{
        //1.加载驱动
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            //System.out.println("驱动加载失败..请检查驱动包");
            e.printStackTrace();
        }
    }

    public Connection getCon(){
        //2.获取和数据库的连接
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //3.返回连接对象
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
    //关闭所有资源的统一代码
    public void close(){
        if(con != null){
            try {
                con.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public void close(PreparedStatement ps){
        if(ps != null){
            try {
                ps.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public void close(ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public void close(HttpServletRequest request){
        if(ps != null){
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        ServletContext application = request.getServletContext();
        Map map = (Map)application.getAttribute("key1");
        map.put(con,true);
    }
}

