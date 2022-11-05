package com.study.permission.intercepter;

import java.util.List;

public interface PermissionInterceptor {
    List<String> getRoleList(Long userId);
}
