package cn.entity;

import java.util.List;

public class DeptEntity2 {
    private Integer deptNo;
    private String deptName;
    private List<EmpEntity2> empList;

    public DeptEntity2() {
    }

    public DeptEntity2(Integer deptNo, String deptName, List<EmpEntity2> empList) {
        this.deptNo = deptNo;
        this.deptName = deptName;
        this.empList = empList;
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

    public List<EmpEntity2> getEmpList() {
        return empList;
    }

    public void setEmpList(List<EmpEntity2> empList) {
        this.empList = empList;
    }
}
