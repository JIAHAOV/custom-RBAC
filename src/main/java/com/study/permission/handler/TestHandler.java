package com.study.permission.handler;

import com.study.permission.annotation.HasRole;
import com.study.permission.domain.User;
import com.study.permission.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 测试 Handler
 */
@RestController
@RequestMapping("/test")
public class TestHandler {
    private final UserService userService;

    public TestHandler(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request, String username) {
        userService.login(request, username);
        return "OK";
    }
    @GetMapping("any")
    public String anybody() {
        return "any";
    }
    @HasRole("admin")
    @GetMapping("admin")
    public String admin() {
        return "admin";
    }
    @HasRole({"user", "admin"})
    @GetMapping("user")
    public String user() {
        return "user";
    }
}
