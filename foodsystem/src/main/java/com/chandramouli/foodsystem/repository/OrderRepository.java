package com.chandramouli.foodsystem.repository;

import com.chandramouli.foodsystem.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}