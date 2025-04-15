package com.linno.cn.entity;

public class SEntity {
    private Integer sNo;
    private String sName;


    public SEntity() {
    }

    public SEntity(Integer sNo, String sName) {
        this.sNo = sNo;
        this.sName = sName;
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
}
