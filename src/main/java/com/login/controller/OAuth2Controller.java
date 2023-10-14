package com.login.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.login.model.User;
import com.login.service.UserService;

@Controller
public class OAuth2Controller {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/user")
    public String user(Principal principal, Model model) {
        if (principal != null) {
            User user = userService.getUserByEmail(principal.getName());
            model.addAttribute("user", user);
        }
        return "user";
    }
}
