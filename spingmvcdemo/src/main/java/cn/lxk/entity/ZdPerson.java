package cn.lxk.entity;

import javax.annotation.Generated;

public class ZdPerson {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String bfAccount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String deleteFlag;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String caseNum;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getName() {
        return name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getBfAccount() {
        return bfAccount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setBfAccount(String bfAccount) {
        this.bfAccount = bfAccount == null ? null : bfAccount.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDeleteFlag() {
        return deleteFlag;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCaseNum() {
        return caseNum;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCaseNum(String caseNum) {
        this.caseNum = caseNum == null ? null : caseNum.trim();
    }
}