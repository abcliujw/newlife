package com.newlife.fitness.entity;

import java.util.Date;

public class Forum {
    private Integer id;

    private Integer userId;

    private String title;

    private String content;

    private Date postingtime;

    private String isadopt;

    private Integer auditingId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getPostingtime() {
        return postingtime;
    }

    public void setPostingtime(Date postingtime) {
        this.postingtime = postingtime;
    }

    public String getIsadopt() {
        return isadopt;
    }

    public void setIsadopt(String isadopt) {
        this.isadopt = isadopt == null ? null : isadopt.trim();
    }

    public Integer getAuditingId() {
        return auditingId;
    }

    public void setAuditingId(Integer auditingId) {
        this.auditingId = auditingId;
    }
}