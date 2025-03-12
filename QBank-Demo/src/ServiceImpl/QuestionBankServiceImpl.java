package ServiceImpl;

import Dao.QuestionBankDao;
import Entity.QuestionBankEntity;
import Service.QuestionBankService;

import java.util.List;

public class QuestionBankServiceImpl implements QuestionBankService {
    private final QuestionBankDao questionBankDao = new QuestionBankDao();

    @Override
    public int insertQuestion(QuestionBankEntity question) throws Exception {
        return questionBankDao.insertQuestion(question);
    }

    @Override
    public int updateQuestion(QuestionBankEntity question) throws Exception {
        return questionBankDao.updateQuestion(question);
    }

    @Override
    public int deleteQuestion(int question_id) throws Exception {
        return questionBankDao.deleteQuestion(question_id);
    }

    @Override
    public List<QuestionBankEntity> queryAllQuestions() throws Exception {
        return questionBankDao.queryAllQuestion();
    }
}
