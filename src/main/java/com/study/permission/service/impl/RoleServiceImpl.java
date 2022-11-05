package com.study.permission.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.permission.domain.Role;
import com.study.permission.mapper.RoleMapper;
import com.study.permission.service.RoleService;
import org.springframework.stereotype.Service;

/**
* @author 18714
* @description 针对表【auth_role(角色表)】的数据库操作Service实现
* @createDate 2022-11-05 17:04:53
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService {

}




