package cn.entity;

import java.util.List;

public class DeptEntity {
    private int deptNo;
    private String dName;
    private String loc;
    private List<EmpEntity> empList;

    public DeptEntity() {
    }

    public DeptEntity(int deptNo, String dName, String loc, List<EmpEntity> empList) {
        this.deptNo = deptNo;
        this.dName = dName;
        this.loc = loc;
        this.empList = empList;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public List<EmpEntity> getEmpList() {
        return empList;
    }

    public void setEmpList(List<EmpEntity> empList) {
        this.empList = empList;
    }

    @Override
    public String toString() {
        return "DeptEntity{" +
                "empList=" + empList +
                '}';
    }
}
