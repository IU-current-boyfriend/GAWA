package Dao;

import Entity.QuestionBankEntity;
import utils.JDBCUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class QuestionBankDao {
    // 题目增加
    public int insertQuestion(QuestionBankEntity questionBankEntity) throws Exception {
        String sql = "insert into question_bank(question_desc,optionA,optionB,optionC,optionD,answer) values(?,?,?,?,?,?);";
        int affectedRows = 0;
        try {
            JDBCUtil.loadClass();
            JDBCUtil.getConnection();
            PreparedStatement ps = JDBCUtil.getPreparedStatement(sql);
            // 快递小哥组装数据
            ps.setString(1, questionBankEntity.getQuestion_desc());
            ps.setString(2, questionBankEntity.getQuestion_option_A());
            ps.setString(3, questionBankEntity.getQuestion_option_B());
            ps.setString(4, questionBankEntity.getQuestion_option_C());
            ps.setString(5, questionBankEntity.getQuestion_option_D());
            ps.setString(6, questionBankEntity.getQuestion_answer());
            affectedRows = ps.executeUpdate();
        } finally {
            JDBCUtil.close();
        }
        return affectedRows;
    }

    // 更新题目
    public int updateQuestion(QuestionBankEntity questionBankEntity) throws Exception {
        String sql = "update question_bank set question_desc=?, optionA=?,optionB=?,optionC=?,optionD=?,answer=? where id=?";
        int affectedRows = 0;
        try {
            JDBCUtil.loadClass();
            JDBCUtil.getConnection();
            PreparedStatement ps = JDBCUtil.getPreparedStatement(sql);
            ps.setString(1, questionBankEntity.getQuestion_desc());
            ps.setString(2, questionBankEntity.getQuestion_option_A());
            ps.setString(3, questionBankEntity.getQuestion_option_B());
            ps.setString(4, questionBankEntity.getQuestion_option_C());
            ps.setString(5, questionBankEntity.getQuestion_option_D());
            ps.setString(6, questionBankEntity.getQuestion_answer());
            ps.setInt(7, questionBankEntity.getQuestion_id());
            affectedRows = ps.executeUpdate();
        } finally {
            JDBCUtil.close();
        }
        return affectedRows;
    }

    // 删除题目
    public int deleteQuestion(int question_id) throws Exception {
        String sql = "delete from question_bank where id=?";
        int affectedRows = 0;
        try {
            JDBCUtil.loadClass();
            JDBCUtil.getConnection();
            PreparedStatement ps = JDBCUtil.getPreparedStatement(sql);
            ps.setInt(1, question_id);
            affectedRows = ps.executeUpdate();
        } finally {
            JDBCUtil.close();
        }
        return affectedRows;
    }

    // 查询所有题目
    public List<QuestionBankEntity> queryAllQuestion() throws Exception {
        String sql = "select * from question_bank";
        ResultSet rs = null;
        List<QuestionBankEntity> allQuestion = new ArrayList<>();
        try {
            JDBCUtil.loadClass();
            JDBCUtil.getConnection();
            PreparedStatement ps = JDBCUtil.getPreparedStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                QuestionBankEntity questionBankEntity = new QuestionBankEntity();
                questionBankEntity.setQuestion_id(rs.getInt("id"));
                questionBankEntity.setQuestion_desc(rs.getString("question_desc"));
                questionBankEntity.setQuestion_option_A(rs.getString("optionA"));
                questionBankEntity.setQuestion_option_B(rs.getString("optionB"));
                questionBankEntity.setQuestion_option_C(rs.getString("optionC"));
                questionBankEntity.setQuestion_option_D(rs.getString("optionD"));
                questionBankEntity.setQuestion_answer(rs.getString("answer"));
                allQuestion.add(questionBankEntity);
            }
        } finally {
            JDBCUtil.close(rs);
        }
        return allQuestion;
    }
}
