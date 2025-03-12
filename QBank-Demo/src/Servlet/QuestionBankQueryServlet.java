package Servlet;

import Data.ResponseData;
import Entity.QuestionBankEntity;
import ServiceImpl.QuestionBankServiceImpl;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(value = "/question_list")
public class QuestionBankQueryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        QuestionBankServiceImpl qbl = new QuestionBankServiceImpl();
        ResponseData responseData = new ResponseData();
        try {
            List<QuestionBankEntity> questionBankEntities = qbl.queryAllQuestions();
            responseData.setCode(200);
            responseData.setMsg("success");
            responseData.setData(questionBankEntities);
            Gson gson = new Gson();
            String data = gson.toJson(responseData);
            res.setContentType("application/json;charset=utf-8");
            PrintWriter out = res.getWriter();
            out.print(data);
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
