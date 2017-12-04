package com.ipace.chaoJie.A004Dto;
/**
 *0代表初始状态//1代表登录成功,2代表登录失败,3代表没有权限,4代表您没有登录
 * //5代表注册等待审核//6代表审核成功,注册通过
 * */
public class Msg {
    //0代表初始状态//1代表登录成功,2代表登录失败,3代表没有权限,4代表您没有登录//5代表注册等待审核//6代表审核成功,注册通过
    private String status="0";
    private String msg="";
    private String chMsg="";
    private String token="";

    private String tenantId="";//公司id,一般是英文,不能一样
    private String tenantName="";//公司名字
    private String userEmail="";//公司里面该用户的用户名,可能是手机号,也可能是email,也可能是user_name

    public String getStatus() {
        return status;
    }

    public Msg setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Msg setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public String getChMsg() {
        return chMsg;
    }

    public Msg setChMsg(String chMsg) {
        this.chMsg = chMsg;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.ipacedev.tcode.dto.Msg{");
        sb.append("status='").append(status).append('\'');
        sb.append(", msg='").append(msg).append('\'');
        sb.append(", chMsg='").append(chMsg).append('\'');
        sb.append(", token='").append(token).append('\'');
        sb.append(", tenantId='").append(tenantId).append('\'');
        sb.append(", tenantName='").append(tenantName).append('\'');
        sb.append(", userEmail='").append(userEmail).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
