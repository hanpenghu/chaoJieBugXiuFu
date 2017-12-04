package com.ipace.chaoJie.A004Dto;

import java.util.Date;

public class BatRec1DayKey {
    private String batNo;

    private String wh;

    private String dep;

    private String prdNo;

    private String prdMark;

    private Date rkDd;

    public String getBatNo() {
        return batNo;
    }

    public void setBatNo(String batNo) {
        this.batNo = batNo == null ? null : batNo.trim();
    }

    public String getWh() {
        return wh;
    }

    public void setWh(String wh) {
        this.wh = wh == null ? null : wh.trim();
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep == null ? null : dep.trim();
    }

    public String getPrdNo() {
        return prdNo;
    }

    public void setPrdNo(String prdNo) {
        this.prdNo = prdNo == null ? null : prdNo.trim();
    }

    public String getPrdMark() {
        return prdMark;
    }

    public void setPrdMark(String prdMark) {
        this.prdMark = prdMark == null ? null : prdMark.trim();
    }

    public Date getRkDd() {
        return rkDd;
    }

    public void setRkDd(Date rkDd) {
        this.rkDd = rkDd;
    }
}