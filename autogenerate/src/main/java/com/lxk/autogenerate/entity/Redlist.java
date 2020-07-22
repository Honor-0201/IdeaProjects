package com.lxk.autogenerate.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 刘旭凯
 * @since 2020-07-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Redlist对象", description="")
public class Redlist implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "红名单id")
    @TableId(value = "red_id", type = IdType.AUTO)
    private Long redId;

    @ApiModelProperty(value = "es索引id")
    private Long esId;

    @ApiModelProperty(value = "禁用姓名")
    private String banName;

    @ApiModelProperty(value = "禁用身份证")
    private String banIdentity;

    @ApiModelProperty(value = "禁用mac")
    private String banMac;

    @ApiModelProperty(value = "禁用imsi")
    private String banImsi;

    @ApiModelProperty(value = "禁用电话")
    private String banTelphone;

    @ApiModelProperty(value = "0-停用 1-启用")
    private Integer enableFlag;

    @ApiModelProperty(value = "删除标记")
    private Integer deleteFlag;

    @ApiModelProperty(value = "创建时间")
    private Date createdTime;

    @ApiModelProperty(value = "创建人")
    private String createdUser;

    @ApiModelProperty(value = "修改时间")
    private Date modifiedTime;

    @ApiModelProperty(value = "修改人")
    private String modifiedUser;

    @ApiModelProperty(value = "修改人角色")
    private String userRole;

    @ApiModelProperty(value = "备注")
    private String other;


}
