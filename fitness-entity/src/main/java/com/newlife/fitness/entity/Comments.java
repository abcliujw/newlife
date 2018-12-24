package com.newlife.fitness.entity;

import java.util.Date;

public class Comments {
    private Integer id;

    private Integer forumId;

    private Integer userId;

    private String content;

    private Date commentTime;

    private String isadopt;

    private Integer auditingId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getForumId() {
        return forumId;
    }

    public void setForumId(Integer forumId) {
        this.forumId = forumId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
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