package com.chandramouli.foodsystem.controller;

import com.chandramouli.foodsystem.model.Order;
import com.chandramouli.foodsystem.service.OrderService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    // ✅ CREATE
    @PostMapping
    public Order addOrder(@RequestBody Order order) {
        return service.saveOrder(order);
    }

    // ✅ READ
    @GetMapping
    public List<Order> getOrders() {
        return service.getAllOrders();
    }

    // ✅ UPDATE (NEW)
    @PutMapping("/{id}")
    public Order updateOrder(@PathVariable Long id, @RequestBody Order order) {
        return service.updateOrder(id, order);
    }

    // ✅ DELETE
    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable Long id) {
        service.deleteOrder(id);
        return "Deleted Successfully";
    }
}