package com.ipace.chaoJie.A004Dto;

public class MfBlnKey {
    private String blId;

    private String blNo;

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
}