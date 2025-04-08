package com.linno.cn.entity;

public class DeptEntity {
    private int id;
    private int deptNo;
    private String dName;
    private String loc;

    public DeptEntity() {
    }

    public DeptEntity(int id, int deptNo, String dName, String loc) {
        this.id = id;
        this.deptNo = deptNo;
        this.dName = dName;
        this.loc = loc;
    }

    public int getId() {
        return id;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public String getdName() {
        return dName;
    }

    public String getLoc() {
        return loc;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
