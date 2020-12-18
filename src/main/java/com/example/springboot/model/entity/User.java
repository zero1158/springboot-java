package com.example.springboot.model.entity;

import java.util.Date;

public class User {
    private Integer id;

    private String serial;

    private String businessAccount;

    private String name;

    private String noticeWay;

    private String level;

    private String createBy;

    private Date createTime;

    private String modifyBy;

    private Date modifyTime;

    private String isDelete;

    private String description;

    public User(Integer id, String serial, String businessAccount, String name, String noticeWay, String level, String createBy, Date createTime, String modifyBy, Date modifyTime, String isDelete, String description) {
        this.id = id;
        this.serial = serial;
        this.businessAccount = businessAccount;
        this.name = name;
        this.noticeWay = noticeWay;
        this.level = level;
        this.createBy = createBy;
        this.createTime = createTime;
        this.modifyBy = modifyBy;
        this.modifyTime = modifyTime;
        this.isDelete = isDelete;
        this.description = description;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial == null ? null : serial.trim();
    }

    public String getBusinessAccount() {
        return businessAccount;
    }

    public void setBusinessAccount(String businessAccount) {
        this.businessAccount = businessAccount == null ? null : businessAccount.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNoticeWay() {
        return noticeWay;
    }

    public void setNoticeWay(String noticeWay) {
        this.noticeWay = noticeWay == null ? null : noticeWay.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}