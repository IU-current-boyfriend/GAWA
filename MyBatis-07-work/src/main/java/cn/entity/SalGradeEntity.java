package cn.entity;

public class SalGradeEntity {
    private Integer grade;
    private Integer loSal;
    private Integer hiSal;

    public SalGradeEntity() {
    }

    public SalGradeEntity(Integer grade, Integer loSal, Integer hiSal) {
        this.grade = grade;
        this.loSal = loSal;
        this.hiSal = hiSal;


    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getLoSal() {
        return loSal;
    }

    public void setLoSal(Integer loSal) {
        this.loSal = loSal;
    }

    public Integer getHiSal() {
        return hiSal;
    }

    public void setHiSal(Integer hiSal) {
        this.hiSal = hiSal;
    }

}
