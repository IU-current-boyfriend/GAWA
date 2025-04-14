package com.linno.cn.entity;

import java.util.List;

public class SEntity {
    private Integer sNo;
    private String sName;
    private List<CEntity> cList;

    public SEntity() {
    }

    public SEntity(Integer sNo, String sName, List<CEntity> cList) {
        this.sNo = sNo;
        this.sName = sName;
        this.cList = cList;
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

    public List<CEntity> getcList() {
        return cList;
    }

    public void setcList(List<CEntity> cList) {
        this.cList = cList;
    }
}
