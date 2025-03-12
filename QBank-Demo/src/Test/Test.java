package Test;

import Entity.QuestionBankEntity;
import ServiceImpl.QuestionBankServiceImpl;

import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) {
        QuestionBankEntity questionBankEntity = new QuestionBankEntity();
        // 创建服务类
        QuestionBankServiceImpl qsl = new QuestionBankServiceImpl();
        // 获取参数,实际上这里要判断字符串是否是null、或者是空字符串,我就不判断了
        questionBankEntity.setQuestion_desc("10*20=?");
        questionBankEntity.setQuestion_option_A("200");
        questionBankEntity.setQuestion_option_B("300");
        questionBankEntity.setQuestion_option_C("400");
        questionBankEntity.setQuestion_option_D("100");
        questionBankEntity.setQuestion_answer("A");
        try {
            qsl.insertQuestion(questionBankEntity);
//            resp.setContentType("text/html;charset=utf-8");
//            PrintWriter pw = resp.getWriter();
//            pw.print("<h1 style='color: red;'>远程添加试题成功！！！</h1>");
//            pw.flush();
//            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
