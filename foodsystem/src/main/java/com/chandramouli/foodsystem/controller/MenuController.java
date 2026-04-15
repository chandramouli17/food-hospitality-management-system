package com.chandramouli.foodsystem.controller;

import com.chandramouli.foodsystem.model.Menu;
import com.chandramouli.foodsystem.service.MenuService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    private final MenuService service;

    public MenuController(MenuService service) {
        this.service = service;
    }

    @GetMapping
    public List<Menu> getMenu() {
        return service.getItems();
    }

    @PostMapping
    public Menu addMenu(@RequestBody Menu menu) {
        return service.addItem(menu);
    }
}