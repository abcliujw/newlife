package com.newlife.fitness.entity;

import java.util.Date;

public class FUser {
    private Integer id;

    private String fUsername;

    private String fLoginname;

    private String fPassword;

    private String fSex;

    private Integer fAge;

    private String fAddress;

    private String fEmail;

    private String fPhone;

    private String fIsvip;

    private String fImgurl;

    private Date fVipbegittime;

    private Date fVipendtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getfUsername() {
        return fUsername;
    }

    public void setfUsername(String fUsername) {
        this.fUsername = fUsername == null ? null : fUsername.trim();
    }

    public String getfLoginname() {
        return fLoginname;
    }

    public void setfLoginname(String fLoginname) {
        this.fLoginname = fLoginname == null ? null : fLoginname.trim();
    }

    public String getfPassword() {
        return fPassword;
    }

    public void setfPassword(String fPassword) {
        this.fPassword = fPassword == null ? null : fPassword.trim();
    }

    public String getfSex() {
        return fSex;
    }

    public void setfSex(String fSex) {
        this.fSex = fSex == null ? null : fSex.trim();
    }

    public Integer getfAge() {
        return fAge;
    }

    public void setfAge(Integer fAge) {
        this.fAge = fAge;
    }

    public String getfAddress() {
        return fAddress;
    }

    public void setfAddress(String fAddress) {
        this.fAddress = fAddress == null ? null : fAddress.trim();
    }

    public String getfEmail() {
        return fEmail;
    }

    public void setfEmail(String fEmail) {
        this.fEmail = fEmail == null ? null : fEmail.trim();
    }

    public String getfPhone() {
        return fPhone;
    }

    public void setfPhone(String fPhone) {
        this.fPhone = fPhone == null ? null : fPhone.trim();
    }

    public String getfIsvip() {
        return fIsvip;
    }

    public void setfIsvip(String fIsvip) {
        this.fIsvip = fIsvip == null ? null : fIsvip.trim();
    }

    public String getfImgurl() {
        return fImgurl;
    }

    public void setfImgurl(String fImgurl) {
        this.fImgurl = fImgurl == null ? null : fImgurl.trim();
    }

    public Date getfVipbegittime() {
        return fVipbegittime;
    }

    public void setfVipbegittime(Date fVipbegittime) {
        this.fVipbegittime = fVipbegittime;
    }

    public Date getfVipendtime() {
        return fVipendtime;
    }

    public void setfVipendtime(Date fVipendtime) {
        this.fVipendtime = fVipendtime;
    }
}