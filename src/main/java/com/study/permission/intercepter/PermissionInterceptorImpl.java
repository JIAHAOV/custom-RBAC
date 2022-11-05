package com.study.permission.intercepter;

import com.study.permission.domain.Role;
import com.study.permission.mapper.UserRoleRelationMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PermissionInterceptorImpl implements PermissionInterceptor{
    private final UserRoleRelationMapper userRoleRelationMapper;

    public PermissionInterceptorImpl(UserRoleRelationMapper userRoleRelationMapper) {
        this.userRoleRelationMapper = userRoleRelationMapper;
    }

    @Override
    public List<String> getRoleList(Long userId) {
        if (userId == null) {
            throw new IllegalArgumentException("参数不能为空");
        }
        ArrayList<String> roles = new ArrayList<>();
        List<Role> result = userRoleRelationMapper.selectRoleByUserId(userId);
        result.forEach(role -> roles.add(role.getRoleName()));
        return roles;
    }
}
