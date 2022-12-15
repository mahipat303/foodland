package com.foodland.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class CurrentUserSession {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer currentId;
    private String mobile;
    private String uuid;
    private LocalDateTime localDateTime;
    private UserType type;

    public CurrentUserSession() {
    }


    public CurrentUserSession(Integer currentId, String mobile, String uuid, LocalDateTime localDateTime, UserType type) {
        this.currentId = currentId;
        this.mobile = mobile;
        this.uuid = uuid;
        this.localDateTime = localDateTime;
        this.type = type;
    }

    public CurrentUserSession(String mobile, String uuid, LocalDateTime localDateTime, UserType type) {
        this.mobile = mobile;
        this.uuid = uuid;
        this.localDateTime = localDateTime;
        this.type = type;
    }

    @Override
    public String toString() {
        return "CurrentUserSession{" +
                "currentId=" + currentId +
                ", mobile='" + mobile + '\'' +
                ", uuid='" + uuid + '\'' +
                ", localDateTime=" + localDateTime +
                ", type=" + type +
                '}';
    }

    public Integer getCurrentId() {
        return currentId;
    }

    public void setCurrentId(Integer currentId) {
        this.currentId = currentId;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
