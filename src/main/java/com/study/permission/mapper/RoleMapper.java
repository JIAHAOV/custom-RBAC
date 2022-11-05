package com.study.permission.mapper;

import com.study.permission.domain.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author 18714
* @description 针对表【auth_role(角色表)】的数据库操作Mapper
* @createDate 2022-11-05 17:04:53
* @Entity generator.domain.Role
*/
@Mapper
public interface RoleMapper extends BaseMapper<Role> {


}




