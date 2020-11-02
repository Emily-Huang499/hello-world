package com.emily.dao;

import com.emily.entity.City;
import com.emily.entity.Province;
import com.emily.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QueryDao {
    private JdbcUtil util = new JdbcUtil();
    Connection conn = util.getCon();

    public List<Province> queryProvinceList() {
        List<Province> provinceList = new ArrayList<>();
        Province p = null;

        String sql = "select id, name, jiancheng, shenghui from province by id";
        PreparedStatement ps = util.createStatement(sql);
        try {
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                p = new Province();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setJiancheng(rs.getString("jiancheng"));
                p.setShenghui(rs.getString("shenghui"));
                provinceList.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close();
        }
        return provinceList;
    }

    public List<City> queryCityList(Integer provinceId) {
        List<City> cityList = new ArrayList<>();
        City c = null;

        String sql = "select id, name from city where provinceid = ?";
        PreparedStatement ps = util.createStatement(sql);
        try {
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                c = new City();
                c.setId(rs.getInt("id"));
                c.setName(rs.getString("name"));
                cityList.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close();
        }
        return cityList;
    }
}
