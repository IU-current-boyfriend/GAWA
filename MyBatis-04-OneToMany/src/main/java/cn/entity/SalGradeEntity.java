package cn.entity;

public class SalGradeEntity {
    private Integer grade;
    private Integer hiSal;
    private Integer loSal;

    public SalGradeEntity() {
    }

    public SalGradeEntity(Integer grade, Integer hiSal, Integer loSal) {
        this.grade = grade;
        this.hiSal = hiSal;
        this.loSal = loSal;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getHiSal() {
        return hiSal;
    }

    public void setHiSal(Integer hiSal) {
        this.hiSal = hiSal;
    }

    public Integer getLoSal() {
        return loSal;
    }

    public void setLoSal(Integer loSal) {
        this.loSal = loSal;
    }

    @Override
    public String toString() {
        return "SalGradeEntity{" +
                "grade=" + grade +
                ", hiSal=" + hiSal +
                ", loSal=" + loSal +
                '}';
    }
}
