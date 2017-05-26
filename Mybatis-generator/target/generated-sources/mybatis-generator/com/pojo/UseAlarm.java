package com.pojo;

import java.util.Date;

public class UseAlarm {
    private Integer id;

    private String softwareId;

    private String softwareName;

    private String status;

    private Date sendTime;

    private Integer userId;

    private String userName;

    private String receiveMail;

    private Date createTime;

    private String remarks;

    private String receiveContent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSoftwareId() {
        return softwareId;
    }

    public void setSoftwareId(String softwareId) {
        this.softwareId = softwareId == null ? null : softwareId.trim();
    }

    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName == null ? null : softwareName.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getReceiveMail() {
        return receiveMail;
    }

    public void setReceiveMail(String receiveMail) {
        this.receiveMail = receiveMail == null ? null : receiveMail.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getReceiveContent() {
        return receiveContent;
    }

    public void setReceiveContent(String receiveContent) {
        this.receiveContent = receiveContent == null ? null : receiveContent.trim();
    }
}