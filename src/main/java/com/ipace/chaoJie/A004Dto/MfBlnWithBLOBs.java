package com.ipace.chaoJie.A004Dto;

public class MfBlnWithBLOBs extends MfBln {
    private String adr;

    private String rem;

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr == null ? null : adr.trim();
    }

    public String getRem() {
        return rem;
    }

    public void setRem(String rem) {
        this.rem = rem == null ? null : rem.trim();
    }
}