package com.jd.webstore.controllers;

import com.jd.webstore.services.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

    private CustomerService customerService;

    @RequestMapping("/customers")
    public String getCusomers(Model model) {

        model.addAttribute("customers", customerService.getAllCustomers());

        return "customers";
    }
}
