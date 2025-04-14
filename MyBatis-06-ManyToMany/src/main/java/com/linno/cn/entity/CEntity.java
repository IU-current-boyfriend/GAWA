package com.linno.cn.entity;

public class CEntity {
    private Integer cNo;
    private String cName;
    private String cTeacher;
    private Integer scGrade;

    public CEntity() {
    }

    public CEntity(Integer cNo, String cName, String cTeacher, Integer scGrade) {
        this.cNo = cNo;
        this.cName = cName;
        this.cTeacher = cTeacher;
        this.scGrade = scGrade;
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

    public String getcTeacher() {
        return cTeacher;
    }

    public void setcTeacher(String cTeacher) {
        this.cTeacher = cTeacher;
    }

    public Integer getScGrade() {
        return scGrade;
    }

    public void setScGrade(Integer scGrade) {
        this.scGrade = scGrade;
    }

    @Override
    public String toString() {
        return "CEntity{" +
                "cNo=" + cNo +
                ", cName='" + cName + '\'' +
                ", cTeacher='" + cTeacher + '\'' +
                ", scGrade=" + scGrade +
                '}';
    }
}
