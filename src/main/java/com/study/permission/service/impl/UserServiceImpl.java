package com.study.permission.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.permission.domain.User;
import com.study.permission.mapper.UserMapper;
import com.study.permission.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author 18714
* @description 针对表【auth__user(用户表)】的数据库操作Service实现
* @createDate 2022-11-05 17:04:53
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




