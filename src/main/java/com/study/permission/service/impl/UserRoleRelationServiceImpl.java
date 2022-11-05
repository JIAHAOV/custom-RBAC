package com.study.permission.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.permission.service.UserRoleRelationService;
import com.study.permission.domain.UserRoleRelation;
import com.study.permission.mapper.UserRoleRelationMapper;
import org.springframework.stereotype.Service;

/**
* @author 18714
* @description 针对表【auth_user_role_relation(用户和角色多对多的关系表)】的数据库操作Service实现
* @createDate 2022-11-05 17:31:27
*/
@Service
public class UserRoleRelationServiceImpl extends ServiceImpl<UserRoleRelationMapper, UserRoleRelation>
    implements UserRoleRelationService {

}




