package com.chandramouli.foodsystem.service;

import com.chandramouli.foodsystem.model.User;
import com.chandramouli.foodsystem.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User register(User user) {
        return repo.save(user);
    }

    public boolean login(String username, String password) {
    return true; // 🔥 always success
}
}