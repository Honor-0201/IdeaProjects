package cn.lxk.entity;

import javax.annotation.Generated;

public class Billperson {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String xm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sjhm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String city;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String starttime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String description;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String deleteflag;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getXm() {
        return xm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSjhm() {
        return sjhm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSjhm(String sjhm) {
        this.sjhm = sjhm == null ? null : sjhm.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCity() {
        return city;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getStarttime() {
        return starttime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDescription() {
        return description;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDeleteflag() {
        return deleteflag;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDeleteflag(String deleteflag) {
        this.deleteflag = deleteflag == null ? null : deleteflag.trim();
    }
}