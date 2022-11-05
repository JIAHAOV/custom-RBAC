package com.study.permission.aop;

import com.study.permission.annotation.HasRole;
import com.study.permission.common.ErrorCode;
import com.study.permission.domain.User;
import com.study.permission.exception.AuthenticationException;
import com.study.permission.intercepter.PermissionInterceptor;
import com.study.permission.utils.UserHolder;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.List;

/**
 * 进行权限校验
 */
@Slf4j
@Aspect
@Component
public class AuthInterceptor {

    private final PermissionInterceptor permissionInterceptor;

    public AuthInterceptor(PermissionInterceptor permissionInterceptor) {
        this.permissionInterceptor = permissionInterceptor;
    }

    @Pointcut("@annotation(com.study.permission.annotation.HasRole)")
    public void pointcut(){};

    @Around("pointcut()")
    public Object doBefore(ProceedingJoinPoint pjp) throws Throwable {
        MethodSignature signature = (MethodSignature)pjp.getSignature();
        // 获取目标方法
        Method method = signature.getMethod();
        // 获取注解信息
        HasRole annotation = method.getAnnotation(HasRole.class);
        // 目标方法名
        String methodName = signature.getName();
        // 获取value的值
        String value = annotation.value();
        User user = UserHolder.getUser();
        if (user == null) {
            throw new AuthenticationException(ErrorCode.NOT_LOGIN);
        }
        Long userId = user.getUserId();
        // 获取角色
        List<String> roles = permissionInterceptor.getRoleList(userId);
        if (!roles.contains(value)) {
            // 权限不足
            log.warn("用户 {} 操作方法 {} 失败", userId, methodName);
            throw new AuthenticationException(ErrorCode.NO_AUTH);
        }
        // 永远权限，正常执行
        return pjp.proceed();
    }
}
