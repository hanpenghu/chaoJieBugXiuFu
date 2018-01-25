package com.ipace.chaoJie.utils.Msg;

import com.ipace.chaoJie.A004Dto.Data;

public class Msg {
    private Data data;
    private String status="0";
    private String xiaoHaoShiJian="";
    private String msg="";
    private String chMsg="";
    private String otherMsg="";
    private String token="";

    private String tenantId="";//公司id,一般是英文,不能一样
    private String tenantName="";//公司名字
    private String userEmail="";//公司里面该用户的用
    private String notExsitThisPrdtNoInPrdtTab="";
    private String weiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao="";

    public static Msg gmg(){
        return new Msg();
    }

    public String getStatus() {
        return status;
    }


    public Msg setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getChMsg() {
        return chMsg;
    }

    public Msg setChMsg(String chMsg) {
        this.chMsg = chMsg;
        return this;
    }

    public String getOtherMsg() {
        return otherMsg;
    }

    public Msg setOtherMsg(String otherMsg) {
        this.otherMsg = otherMsg;
        return this;
    }

    public String getToken() {
        return token;
    }

    public Msg setToken(String token) {
        this.token = token;
        return this;
    }

    public String getTenantId() {
        return tenantId;
    }

    public Msg setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    public String getTenantName() {
        return tenantName;
    }

    public Msg setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public Msg setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    public String getXiaoHaoShiJian() {
        return xiaoHaoShiJian;
    }

    public void setXiaoHaoShiJian(String xiaoHaoShiJian) {
        this.xiaoHaoShiJian = xiaoHaoShiJian;
    }

    public String getWeiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao() {
        return weiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao;
    }

    public void setWeiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao(String weiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao) {
        this.weiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao = weiNengChaRuHuoZheChaRuShiBaiDeSuoYouDingDanHao;
    }

    public String getNotExsitThisPrdtNoInPrdtTab() {
        return notExsitThisPrdtNoInPrdtTab;
    }

    public void setNotExsitThisPrdtNoInPrdtTab(String notExsitThisPrdtNoInPrdtTab) {
        this.notExsitThisPrdtNoInPrdtTab = notExsitThisPrdtNoInPrdtTab;
    }

    public Msg setMsg(String msg) {
        this.msg = msg;return this;
    }

    public String getMsg() {
        return this.msg;
    }

    public Data getData() {
        return data;
    }

    public Msg setData(Data data) {
        this.data = data;
        return this;
    }


}
