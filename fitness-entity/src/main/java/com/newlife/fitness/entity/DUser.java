package com.newlife.fitness.entity;

public class DUser {
    private Integer id;

    private String dUsername;

    private String dLoginname;

    private String dPassword;

    private String dSex;

    private String dEmail;

    private String dPhone;

    private String dImgurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getdUsername() {
        return dUsername;
    }

    public void setdUsername(String dUsername) {
        this.dUsername = dUsername == null ? null : dUsername.trim();
    }

    public String getdLoginname() {
        return dLoginname;
    }

    public void setdLoginname(String dLoginname) {
        this.dLoginname = dLoginname == null ? null : dLoginname.trim();
    }

    public String getdPassword() {
        return dPassword;
    }

    public void setdPassword(String dPassword) {
        this.dPassword = dPassword == null ? null : dPassword.trim();
    }

    public String getdSex() {
        return dSex;
    }

    public void setdSex(String dSex) {
        this.dSex = dSex == null ? null : dSex.trim();
    }

    public String getdEmail() {
        return dEmail;
    }

    public void setdEmail(String dEmail) {
        this.dEmail = dEmail == null ? null : dEmail.trim();
    }

    public String getdPhone() {
        return dPhone;
    }

    public void setdPhone(String dPhone) {
        this.dPhone = dPhone == null ? null : dPhone.trim();
    }

    public String getdImgurl() {
        return dImgurl;
    }

    public void setdImgurl(String dImgurl) {
        this.dImgurl = dImgurl == null ? null : dImgurl.trim();
    }
}