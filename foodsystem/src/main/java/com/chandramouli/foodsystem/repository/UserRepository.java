package com.chandramouli.foodsystem.repository;

import com.chandramouli.foodsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameIgnoreCase(String username);
}
