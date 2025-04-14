package cn.entity;

import java.util.List;

public class DeptEntity {
    private Integer deptNo;
    private String deptName;
    private List<EmpEntity> emp;

    public DeptEntity() {
    }

    public DeptEntity(Integer deptNo, String deptName, List<EmpEntity> emp) {
        this.deptNo = deptNo;
        this.deptName = deptName;
        this.emp = emp;
    }

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<EmpEntity> getEmp() {
        return emp;
    }

    public void setEmp(List<EmpEntity> emp) {
        this.emp = emp;
    }
}
