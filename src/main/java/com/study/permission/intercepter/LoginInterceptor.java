package com.study.permission.intercepter;

import com.study.permission.common.ErrorCode;
import com.study.permission.domain.User;
import com.study.permission.exception.AuthenticationException;
import com.study.permission.utils.UserHolder;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.study.permission.constants.UserConstants.SESSION_KEY;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object userInfo = request.getSession().getAttribute(SESSION_KEY);
        if (userInfo == null) {
            throw new AuthenticationException(ErrorCode.NOT_LOGIN);
        }
        UserHolder.saveUser((User) userInfo);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        UserHolder.removeUser();
    }
}
