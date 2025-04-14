package com.linno.cn.entity;

public class SEntity2 {
    private Integer sNo;
    private String sName;
    private Integer scGrade;

    public SEntity2() {
    }

    public SEntity2(Integer sNo, String sName, Integer scGrade) {
        this.sNo = sNo;
        this.sName = sName;
        this.scGrade = scGrade;
    }

    public Integer getsNo() {
        return sNo;
    }

    public void setsNo(Integer sNo) {
        this.sNo = sNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Integer getScGrade() {
        return scGrade;
    }

    public void setScGrade(Integer scGrade) {
        this.scGrade = scGrade;
    }

    @Override
    public String toString() {
        return "SEntity2{" +
                "sNo=" + sNo +
                ", sName='" + sName + '\'' +
                ", scGrade=" + scGrade +
                '}';
    }
}
