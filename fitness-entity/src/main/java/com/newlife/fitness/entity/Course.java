package com.newlife.fitness.entity;

public class Course {
    private Integer id;

    private String cName;

    private String cIsvip;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcIsvip() {
        return cIsvip;
    }

    public void setcIsvip(String cIsvip) {
        this.cIsvip = cIsvip == null ? null : cIsvip.trim();
    }
}