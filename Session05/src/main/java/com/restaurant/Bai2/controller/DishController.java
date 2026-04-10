package com.restaurant.Bai2.controller;

import com.restaurant.common.Dish;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class DishController {

    @GetMapping("/bai2/menu")
    public String showMenu(Model model) {
        List<Dish> menu = new ArrayList<>();
        menu.add(new Dish(1, "Phở Bò", 50000.0, true));
        menu.add(new Dish(2, "Bún Chả", 45000.0, false));
        menu.add(new Dish(3, "Nem Rán", 30000.0, true));

        model.addAttribute("dishes", menu);
        return "dish-list";
    }
}
