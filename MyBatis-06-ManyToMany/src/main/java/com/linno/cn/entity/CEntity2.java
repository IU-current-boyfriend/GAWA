package com.linno.cn.entity;

import java.util.List;

public class CEntity2 {
    private Integer cNo;
    private String cName;
    private List<SEntity2> students;

    public CEntity2() {
    }

    public CEntity2(Integer cNo, String cName, List<SEntity2> students) {
        this.cNo = cNo;
        this.cName = cName;
        this.students = students;
    }


    public Integer getcNo() {
        return cNo;
    }

    public void setcNo(Integer cNo) {
        this.cNo = cNo;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public List<SEntity2> getStudents() {
        return students;
    }

    public void setStudents(List<SEntity2> students) {
        this.students = students;
    }
}
