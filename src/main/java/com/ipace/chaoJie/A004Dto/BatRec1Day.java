package com.ipace.chaoJie.A004Dto;

import java.math.BigDecimal;
import java.util.Date;

public class BatRec1Day extends BatRec1DayKey {
    private BigDecimal qtyIn;

    private BigDecimal qtyInUnsh;

    private BigDecimal qtyOut;

    private BigDecimal qtyOutUnsh;

    private BigDecimal qty1In;

    private BigDecimal qty1InUnsh;

    private BigDecimal qty1Out;

    private BigDecimal qty1OutUnsh;

    private Date validDd;

    private Date lstOtd;

    private String lockId;

    private Date produDd;

    private String rem;

    public BigDecimal getQtyIn() {
        return qtyIn;
    }

    public void setQtyIn(BigDecimal qtyIn) {
        this.qtyIn = qtyIn;
    }

    public BigDecimal getQtyInUnsh() {
        return qtyInUnsh;
    }

    public void setQtyInUnsh(BigDecimal qtyInUnsh) {
        this.qtyInUnsh = qtyInUnsh;
    }

    public BigDecimal getQtyOut() {
        return qtyOut;
    }

    public void setQtyOut(BigDecimal qtyOut) {
        this.qtyOut = qtyOut;
    }

    public BigDecimal getQtyOutUnsh() {
        return qtyOutUnsh;
    }

    public void setQtyOutUnsh(BigDecimal qtyOutUnsh) {
        this.qtyOutUnsh = qtyOutUnsh;
    }

    public BigDecimal getQty1In() {
        return qty1In;
    }

    public void setQty1In(BigDecimal qty1In) {
        this.qty1In = qty1In;
    }

    public BigDecimal getQty1InUnsh() {
        return qty1InUnsh;
    }

    public void setQty1InUnsh(BigDecimal qty1InUnsh) {
        this.qty1InUnsh = qty1InUnsh;
    }

    public BigDecimal getQty1Out() {
        return qty1Out;
    }

    public void setQty1Out(BigDecimal qty1Out) {
        this.qty1Out = qty1Out;
    }

    public BigDecimal getQty1OutUnsh() {
        return qty1OutUnsh;
    }

    public void setQty1OutUnsh(BigDecimal qty1OutUnsh) {
        this.qty1OutUnsh = qty1OutUnsh;
    }

    public Date getValidDd() {
        return validDd;
    }

    public void setValidDd(Date validDd) {
        this.validDd = validDd;
    }

    public Date getLstOtd() {
        return lstOtd;
    }

    public void setLstOtd(Date lstOtd) {
        this.lstOtd = lstOtd;
    }

    public String getLockId() {
        return lockId;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId == null ? null : lockId.trim();
    }

    public Date getProduDd() {
        return produDd;
    }

    public void setProduDd(Date produDd) {
        this.produDd = produDd;
    }

    public String getRem() {
        return rem;
    }

    public void setRem(String rem) {
        this.rem = rem == null ? null : rem.trim();
    }
}