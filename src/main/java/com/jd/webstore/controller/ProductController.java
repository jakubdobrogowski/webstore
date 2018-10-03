package com.jd.webstore.controller;

import com.jd.webstore.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;

@Controller
public class ProductController {

    @RequestMapping("/products")
    public String list(Model model) {

        Product product = new Product();

        product.setProductId("133wf212f2112");
        product.setName("IPhone");
        product.setManufacturer("Apple");
        product.setCategory("Phone");
        product.setUnitPrice(BigDecimal.valueOf(2500));
        product.setCondition("Brand New");

        model.addAttribute("product", product);

        return "products";
    }
}
