package Entity;

public class QuestionBankEntity {
    // 题目编号
    private int question_id;
    // 题目描述
    private String question_desc;
    // 选项A\B\C\D
    private String question_option_A;
    private String question_option_B;
    private String question_option_C;
    private String question_option_D;
    // 题目答案
    private String question_answer;

    public QuestionBankEntity() {
    }

    public String getQuestion_desc() {
        return question_desc;
    }

    public QuestionBankEntity(int question_id, String question_desc, String question_option_A, String question_option_B, String question_option_C, String question_option_D, String question_answer) {
        this.question_id = question_id;
        this.question_desc = question_desc;
        this.question_option_A = question_option_A;
        this.question_option_B = question_option_B;
        this.question_option_C = question_option_C;
        this.question_option_D = question_option_D;
        this.question_answer = question_answer;
    }

    public void setQuestion_desc(String question_desc) {
        this.question_desc = question_desc;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public String getQuestion_option_A() {
        return question_option_A;
    }

    public void setQuestion_option_A(String question_option_A) {
        this.question_option_A = question_option_A;
    }

    public String getQuestion_option_B() {
        return question_option_B;
    }

    public void setQuestion_option_B(String question_option_B) {
        this.question_option_B = question_option_B;
    }

    public String getQuestion_option_C() {
        return question_option_C;
    }

    public void setQuestion_option_C(String question_option_C) {
        this.question_option_C = question_option_C;
    }

    public String getQuestion_answer() {
        return question_answer;
    }

    public void setQuestion_answer(String question_answer) {
        this.question_answer = question_answer;
    }

    public String getQuestion_option_D() {
        return question_option_D;
    }

    public void setQuestion_option_D(String question_option_D) {
        this.question_option_D = question_option_D;
    }
}
