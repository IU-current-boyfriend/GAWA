package com.linno.cn.entity;

// 部门实体类
public class DeptEntity {
    private Integer deptId;
    private String deptName;
    private String loc;

    public DeptEntity() {
    }

    public Integer getDeptId() {
        return deptId;
    }

    public DeptEntity(Integer deptId, String deptName, String loc) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.loc = loc;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
