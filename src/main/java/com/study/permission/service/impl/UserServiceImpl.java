package com.study.permission.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.permission.domain.User;
import com.study.permission.mapper.UserMapper;
import com.study.permission.service.UserService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

import static com.study.permission.constants.UserConstants.SESSION_KEY;

/**
* @author 18714
* @description 针对表【auth__user(用户表)】的数据库操作Service实现
* @createDate 2022-11-05 17:04:53
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

    @Override
    public void login(HttpServletRequest request, String username) {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getUsername, username);
        User user = this.getOne(wrapper);
        request.getSession().setAttribute(SESSION_KEY, user);
    }
}




