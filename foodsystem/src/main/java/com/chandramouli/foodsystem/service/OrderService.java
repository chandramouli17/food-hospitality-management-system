package com.chandramouli.foodsystem.service;

import com.chandramouli.foodsystem.model.Order;
import com.chandramouli.foodsystem.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public Order saveOrder(Order order) {
        return repository.save(order);
    }

    public List<Order> getAllOrders() {
        return repository.findAll();
    }

    public void deleteOrder(Long id) {
        repository.deleteById(id);
    }

    // ✅ NEW UPDATE METHOD
    public Order updateOrder(Long id, Order newOrder) {
        Order existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        existing.setCustomerName(newOrder.getCustomerName());
        existing.setFoodItem(newOrder.getFoodItem());
        existing.setQuantity(newOrder.getQuantity());

        return repository.save(existing);
    }
}