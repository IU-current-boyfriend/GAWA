package cn.entity;

// 职员信息实体类
public class EmpEntity {
    private Integer empNo;
    private String ename;
    private String job;
    private Double sal;
    private Double comm;
    private Integer mgr;
    private String hireDate;
    private Integer deptNo;
    private SalGradeEntity salGrade;

    public EmpEntity() {
    }

    public EmpEntity(Integer empNo, String ename, String job, Double sal, Double comm, Integer mgr, String hireDate, Integer deptNo, SalGradeEntity salGrade) {
        this.empNo = empNo;
        this.ename = ename;
        this.job = job;
        this.sal = sal;
        this.comm = comm;
        this.mgr = mgr;
        this.hireDate = hireDate;
        this.deptNo = deptNo;
        this.salGrade = salGrade;
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public Double getComm() {
        return comm;
    }

    public void setComm(Double comm) {
        this.comm = comm;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    public SalGradeEntity getSalGrade() {
        return salGrade;
    }

    public void setSalGrade(SalGradeEntity salGrade) {
        this.salGrade = salGrade;
    }

    @Override
    public String toString() {
        return "EmpEntity{" +
                "empNo=" + empNo +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                ", comm=" + comm +
                ", mgr=" + mgr +
                ", hireDate='" + hireDate + '\'' +
                ", deptNo=" + deptNo;
    }
}


