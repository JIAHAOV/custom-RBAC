package com.study.permission.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户和角色多对多的关系表
 * @TableName auth_user_role_relation
 */
@TableName(value ="auth_user_role_relation")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRoleRelation implements Serializable {
    /**
     * 用户id
     */
    private Long userId;

    /**
     * 关系主键
     */
    @TableId
    private Long relationId;

    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 0 未被删除，1 已删除
     */
    private Integer deleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}