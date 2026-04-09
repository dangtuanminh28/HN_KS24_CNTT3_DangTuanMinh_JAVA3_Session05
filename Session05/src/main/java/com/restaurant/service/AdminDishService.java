package com.restaurant.service;

import com.restaurant.common.Dish;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AdminDishService {
    private List<Dish> mockData = new ArrayList<>(List.of(
            new Dish(1, "Phở Bò", 50000.0, true),
            new Dish(2, "Bún Chả", 45000.0, false),
            new Dish(3, "Nem Rán", 30000.0, true)
    ));

    public List<Dish> findAll() { return mockData; }

    public Optional<Dish> findById(String id) {
        try {
            int idInt = Integer.parseInt(id);
            return mockData.stream().filter(d -> d.getId() == idInt).findFirst();
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}