package cn.entity;

public class EmpEntity {
    private String eName;
    private Integer sal;
    private Integer grade;

    public EmpEntity() {
    }

    public EmpEntity(String eName, Integer sal, Integer grade) {
        this.eName = eName;
        this.sal = sal;
        this.grade = grade;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "EmpEntity{" +
                "eName='" + eName + '\'' +
                ", sal=" + sal +
                ", grade=" + grade +
                '}';
    }
}
