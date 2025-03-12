package Servlet;

import Entity.QuestionBankEntity;
import ServiceImpl.QuestionBankServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/question_insert")
public class QuestionBankInsertServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 创建实体类
        QuestionBankEntity questionBankEntity = new QuestionBankEntity();
        // 创建服务类
        QuestionBankServiceImpl qsl = new QuestionBankServiceImpl();
        // 获取参数,实际上这里要判断字符串是否是null、或者是空字符串,我就不判断了
        questionBankEntity.setQuestion_desc(req.getParameter("question_desc"));
        questionBankEntity.setQuestion_option_A(req.getParameter("optionA"));
        questionBankEntity.setQuestion_option_B(req.getParameter("optionB"));
        questionBankEntity.setQuestion_option_C(req.getParameter("optionC"));
        questionBankEntity.setQuestion_option_D(req.getParameter("optionD"));
        questionBankEntity.setQuestion_answer(req.getParameter("answer"));
        try {
            qsl.insertQuestion(questionBankEntity);
            resp.setContentType("text/html;charset=utf-8");
            resp.sendRedirect("/question_bank/query.html");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}