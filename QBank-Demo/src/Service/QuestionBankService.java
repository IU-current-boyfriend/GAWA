package Service;

import Entity.QuestionBankEntity;

import java.util.List;

public interface QuestionBankService {
    // 增加题库
    int insertQuestion(QuestionBankEntity question) throws Exception;

    // 更新题库
    int updateQuestion(QuestionBankEntity question) throws Exception;

    // 删除题库
    int deleteQuestion(int question_id) throws Exception;

    // 查询题库
    List<QuestionBankEntity> queryAllQuestions() throws Exception;
}
