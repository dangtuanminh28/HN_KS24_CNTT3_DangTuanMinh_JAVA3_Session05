package com.restaurant.Bai4.controller;

import com.restaurant.service.AdminDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DishLayoutController {

    @Autowired
    private AdminDishService adminDishService;

    @GetMapping("/bai4/list")
    public String showLayoutMenu(Model model) {
        model.addAttribute("dishes", adminDishService.findAll());

        return "dish-list";
    }
}