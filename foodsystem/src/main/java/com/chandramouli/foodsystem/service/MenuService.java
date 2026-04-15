package com.chandramouli.foodsystem.service;

import com.chandramouli.foodsystem.model.Menu;
import com.chandramouli.foodsystem.repository.MenuRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    private final MenuRepository repo;

    public MenuService(MenuRepository repo) {
        this.repo = repo;
    }

    public Menu addItem(Menu menu) {
        return repo.save(menu);
    }

    public List<Menu> getItems() {
        return repo.findAll();
    }
}