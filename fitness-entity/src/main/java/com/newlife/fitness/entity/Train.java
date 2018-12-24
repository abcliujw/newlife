package com.newlife.fitness.entity;

public class Train {
    private Integer id;

    private String tUsername;

    private String tLoginname;

    private String tPassword;

    private String tSex;

    private Integer tAge;

    private String tAddress;

    private String tEmail;

    private String tPhone;

    private String tIsvip;

    private String tImgurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String gettUsername() {
        return tUsername;
    }

    public void settUsername(String tUsername) {
        this.tUsername = tUsername == null ? null : tUsername.trim();
    }

    public String gettLoginname() {
        return tLoginname;
    }

    public void settLoginname(String tLoginname) {
        this.tLoginname = tLoginname == null ? null : tLoginname.trim();
    }

    public String gettPassword() {
        return tPassword;
    }

    public void settPassword(String tPassword) {
        this.tPassword = tPassword == null ? null : tPassword.trim();
    }

    public String gettSex() {
        return tSex;
    }

    public void settSex(String tSex) {
        this.tSex = tSex == null ? null : tSex.trim();
    }

    public Integer gettAge() {
        return tAge;
    }

    public void settAge(Integer tAge) {
        this.tAge = tAge;
    }

    public String gettAddress() {
        return tAddress;
    }

    public void settAddress(String tAddress) {
        this.tAddress = tAddress == null ? null : tAddress.trim();
    }

    public String gettEmail() {
        return tEmail;
    }

    public void settEmail(String tEmail) {
        this.tEmail = tEmail == null ? null : tEmail.trim();
    }

    public String gettPhone() {
        return tPhone;
    }

    public void settPhone(String tPhone) {
        this.tPhone = tPhone == null ? null : tPhone.trim();
    }

    public String gettIsvip() {
        return tIsvip;
    }

    public void settIsvip(String tIsvip) {
        this.tIsvip = tIsvip == null ? null : tIsvip.trim();
    }

    public String gettImgurl() {
        return tImgurl;
    }

    public void settImgurl(String tImgurl) {
        this.tImgurl = tImgurl == null ? null : tImgurl.trim();
    }
}