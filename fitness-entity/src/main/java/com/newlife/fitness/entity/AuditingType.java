package com.newlife.fitness.entity;

public class AuditingType {
    private Integer id;

    private String violationname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getViolationname() {
        return violationname;
    }

    public void setViolationname(String violationname) {
        this.violationname = violationname == null ? null : violationname.trim();
    }
}