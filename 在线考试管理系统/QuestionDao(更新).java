package com.emily.dao;

import com.emily.entity.Question;
import com.emily.util.JdbcUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public List findAll(){
        String sql = "select * from question";
        PreparedStatement ps = util.createStatement(sql);
        ResultSet rs = null;
        List<Question> questionList = new ArrayList<>();
        try {
            rs = ps.executeQuery();
            while (rs.next()){
                Integer questionId = rs.getInt("questionId");
                String title = rs.getString("title");
                String optionA = rs.getString("optionA");
                String optionB = rs.getString("optionB");
                String optionC = rs.getString("optionC");
                String optionD = rs.getString("optionD");
                String answer = rs.getString("answer");
                Question questions = new Question(questionId,title,optionA,optionB,optionC,optionD,answer);
                questionList.add(questions);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close();
        }
        return questionList;
    }
}
