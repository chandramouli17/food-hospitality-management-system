package com.chandramouli.foodsystem.controller;

import com.chandramouli.foodsystem.model.User;
import com.chandramouli.foodsystem.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {

    private final UserService service;

    public AuthController(UserService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return service.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        boolean valid = service.login(user.getUsername(), user.getPassword());

        if (valid) return "SUCCESS";
        else return "FAIL";
    }
}