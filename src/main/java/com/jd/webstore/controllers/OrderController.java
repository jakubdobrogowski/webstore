package com.jd.webstore.controllers;

import com.jd.webstore.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/order/P1234/3")
    public String order(Model model) {

        orderService.processOrder("P1234", 3);

        return "redirect:/products";
    }
}
