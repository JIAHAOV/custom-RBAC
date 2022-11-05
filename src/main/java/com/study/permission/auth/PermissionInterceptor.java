package com.study.permission.auth;

import java.util.List;

/**
 * 查询当前用户角色
 */
public interface PermissionInterceptor {
    /**
     * @param userId 用户
     * @return 当前用户的身份
     */
    List<String> getRoleList(Long userId);
}
