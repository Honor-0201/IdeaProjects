package cn.lxk.entity;

import java.util.Date;
import javax.annotation.Generated;

public class Imsi {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String regindId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String serialId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String userId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date collectionTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String imsi;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date time;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String source;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String messageLogo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String deleteFlag;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRegindId() {
        return regindId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRegindId(String regindId) {
        this.regindId = regindId == null ? null : regindId.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSerialId() {
        return serialId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSerialId(String serialId) {
        this.serialId = serialId == null ? null : serialId.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUserId() {
        return userId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getCollectionTime() {
        return collectionTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCollectionTime(Date collectionTime) {
        this.collectionTime = collectionTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getImsi() {
        return imsi;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setImsi(String imsi) {
        this.imsi = imsi == null ? null : imsi.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getTime() {
        return time;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTime(Date time) {
        this.time = time;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSource() {
        return source;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMessageLogo() {
        return messageLogo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMessageLogo(String messageLogo) {
        this.messageLogo = messageLogo == null ? null : messageLogo.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDeleteFlag() {
        return deleteFlag;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }
}