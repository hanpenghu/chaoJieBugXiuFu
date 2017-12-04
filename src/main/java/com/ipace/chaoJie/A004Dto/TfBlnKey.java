package com.ipace.chaoJie.A004Dto;

public class TfBlnKey {
    private String blId;

    private String blNo;

    private Integer itm;

    public String getBlId() {
        return blId;
    }

    public void setBlId(String blId) {
        this.blId = blId == null ? null : blId.trim();
    }

    public String getBlNo() {
        return blNo;
    }

    public void setBlNo(String blNo) {
        this.blNo = blNo == null ? null : blNo.trim();
    }

    public Integer getItm() {
        return itm;
    }

    public void setItm(Integer itm) {
        this.itm = itm;
    }
}