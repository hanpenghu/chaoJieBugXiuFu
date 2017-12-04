package com.ipace.chaoJie.A004Dto;

public class MfBlnZ extends MfBlnZKey {
    private String csdb;

    public String getCsdb() {
        return csdb;
    }

    public void setCsdb(String csdb) {
        this.csdb = csdb == null ? null : csdb.trim();
    }
}