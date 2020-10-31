package com.emily.dao;

import com.emily.entity.Question;
import com.emily.util.JdbcUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class QuestionDao {
    private JdbcUtil util = new JdbcUtil();
    public int add(Question question){
        String sql = "insert into question(title,optionA,optionB,optionC,optionD,answer) values (?,?,?,?,?,?)";
        PreparedStatement ps = util.createStatement(sql);
        int result = 0;
        try {
            ps.setString(1,question.getTitle());
            ps.setString(2, question.getOptionA());
            ps.setString(3,question.getOptionB());
            ps.setString(4,question.getOptionC());
            ps.setString(5,question.getOptionD());
            ps.setString(6, question.getAnswer());
            result = ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            util.close();
        }
        return result;
    }
}
