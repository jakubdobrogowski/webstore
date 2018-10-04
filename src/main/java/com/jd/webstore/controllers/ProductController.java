package com.jd.webstore.controllers;

import com.jd.webstore.repositories.ProductRepository;
import com.jd.webstore.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public String list(Model model) {

        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }
}
