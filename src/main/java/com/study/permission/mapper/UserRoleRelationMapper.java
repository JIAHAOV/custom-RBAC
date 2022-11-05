package com.study.permission.mapper;

import com.study.permission.domain.Role;
import com.study.permission.domain.UserRoleRelation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author 18714
* @description 针对表【auth_user_role_relation(用户和角色多对多的关系表)】的数据库操作Mapper
* @createDate 2022-11-05 17:31:27
* @Entity generator.domain.UserRoleRelation
*/
@Mapper
public interface UserRoleRelationMapper extends BaseMapper<UserRoleRelation> {
    List<Role> selectRoleByUserId(@Param("userId") Long userId);
}




