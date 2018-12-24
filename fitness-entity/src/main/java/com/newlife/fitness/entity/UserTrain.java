package com.newlife.fitness.entity;

public class UserTrain {
    private Integer id;

    private Integer userId;

    private Integer trainId;

    private String userMassage;

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

    public Integer getTrainId() {
        return trainId;
    }

    public void setTrainId(Integer trainId) {
        this.trainId = trainId;
    }

    public String getUserMassage() {
        return userMassage;
    }

    public void setUserMassage(String userMassage) {
        this.userMassage = userMassage == null ? null : userMassage.trim();
    }
}