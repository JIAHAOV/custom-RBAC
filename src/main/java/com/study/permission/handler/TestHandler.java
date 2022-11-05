package com.study.permission.handler;

import com.study.permission.annotation.HasRole;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试 Handler
 */
@RestController
@RequestMapping("/test")
public class TestHandler {
    @GetMapping("/login")
    public String login() {
        return "OK";
    }
    @GetMapping("any")
    public String anybody() {
        return "any";
    }
    @GetMapping("admin")
    public String admin() {
        return "admin";
    }
    @HasRole("user")
    @GetMapping("user")
    public String user() {
        return "user";
    }
}
