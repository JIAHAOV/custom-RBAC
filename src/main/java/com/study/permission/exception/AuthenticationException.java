package com.study.permission.exception;

import com.study.permission.common.ErrorCode;

/***
 * 自定义异常类
 */
public class AuthenticationException extends RuntimeException{
    private final int code;

    private final String description;

    public AuthenticationException(String message, int code, String description) {
        super(message);
        this.code = code;
        this.description = description;
    }

    public AuthenticationException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = errorCode.getDescription();
    }

    public AuthenticationException(ErrorCode errorCode, String description) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
