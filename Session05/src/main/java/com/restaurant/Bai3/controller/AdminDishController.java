package com.restaurant.Bai3.controller;

import com.restaurant.common.Dish;
import com.restaurant.service.AdminDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bai3")
public class AdminDishController {

    @Autowired
    private AdminDishService adminDishService;

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") String id, Model model) {
        var dishOpt = adminDishService.findById(id);
        if (dishOpt.isEmpty()) {
            model.addAttribute("errorMessage", "Không tìm thấy món ăn yêu cầu!");
            model.addAttribute("dishes", adminDishService.findAll());
            return "dish-list";
        }
        model.addAttribute("dish", dishOpt.get());
        return "edit-dish";
    }

    @PostMapping("/update")
    public String updateDish(@ModelAttribute("dish") Dish updatedDish) {
        adminDishService.findAll().stream()
                .filter(d -> d.getId() == updatedDish.getId())
                .findFirst()
                .ifPresent(d -> {
                    d.setName(updatedDish.getName());
                    d.setPrice(updatedDish.getPrice());
                    d.setAvailable(updatedDish.isAvailable());
                });

        return "redirect:/bai2/menu";
    }
}