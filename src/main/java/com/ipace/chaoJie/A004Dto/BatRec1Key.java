package com.ipace.chaoJie.A004Dto;

public class BatRec1Key {
    private String batNo;

    private String prdNo;

    private String wh;

    private String prdMark;

    public String getBatNo() {
        return batNo;
    }

    public void setBatNo(String batNo) {
        this.batNo = batNo == null ? null : batNo.trim();
    }

    public String getPrdNo() {
        return prdNo;
    }

    public void setPrdNo(String prdNo) {
        this.prdNo = prdNo == null ? null : prdNo.trim();
    }

    public String getWh() {
        return wh;
    }

    public void setWh(String wh) {
        this.wh = wh == null ? null : wh.trim();
    }

    public String getPrdMark() {
        return prdMark;
    }

    public void setPrdMark(String prdMark) {
        this.prdMark = prdMark == null ? null : prdMark.trim();
    }
}