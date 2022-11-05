package com.study.permission.service;

import com.study.permission.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
* @author 18714
* @description 针对表【auth__user(用户表)】的数据库操作Service
* @createDate 2022-11-05 17:04:53
*/
public interface UserService extends IService<User> {

    void login(HttpServletRequest request, String username);
}
