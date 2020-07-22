package com.lwh.mybatisgenerator.domain;

import java.io.Serializable;
import java.util.Date;

public class Redlist implements Serializable {
    private Long redId;

    private Long esId;

    private String banName;

    private String banIdentity;

    private String banMac;

    private String banImsi;

    private String banTelphone;

    private Byte enableFlag;

    private Byte deleteFlag;

    private Date createdTime;

    private String createdUser;

    private Date modifiedTime;

    private String modifiedUser;

    private String userRole;

    private String other;

    private static final long serialVersionUID = 1L;

    public Long getRedId() {
        return redId;
    }

    public void setRedId(Long redId) {
        this.redId = redId;
    }

    public Long getEsId() {
        return esId;
    }

    public void setEsId(Long esId) {
        this.esId = esId;
    }

    public String getBanName() {
        return banName;
    }

    public void setBanName(String banName) {
        this.banName = banName == null ? null : banName.trim();
    }

    public String getBanIdentity() {
        return banIdentity;
    }

    public void setBanIdentity(String banIdentity) {
        this.banIdentity = banIdentity == null ? null : banIdentity.trim();
    }

    public String getBanMac() {
        return banMac;
    }

    public void setBanMac(String banMac) {
        this.banMac = banMac == null ? null : banMac.trim();
    }

    public String getBanImsi() {
        return banImsi;
    }

    public void setBanImsi(String banImsi) {
        this.banImsi = banImsi == null ? null : banImsi.trim();
    }

    public String getBanTelphone() {
        return banTelphone;
    }

    public void setBanTelphone(String banTelphone) {
        this.banTelphone = banTelphone == null ? null : banTelphone.trim();
    }

    public Byte getEnableFlag() {
        return enableFlag;
    }

    public void setEnableFlag(Byte enableFlag) {
        this.enableFlag = enableFlag;
    }

    public Byte getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Byte deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser == null ? null : createdUser.trim();
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser == null ? null : modifiedUser.trim();
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole == null ? null : userRole.trim();
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", redId=").append(redId);
        sb.append(", esId=").append(esId);
        sb.append(", banName=").append(banName);
        sb.append(", banIdentity=").append(banIdentity);
        sb.append(", banMac=").append(banMac);
        sb.append(", banImsi=").append(banImsi);
        sb.append(", banTelphone=").append(banTelphone);
        sb.append(", enableFlag=").append(enableFlag);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", modifiedUser=").append(modifiedUser);
        sb.append(", userRole=").append(userRole);
        sb.append(", other=").append(other);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}