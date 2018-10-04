package com.jd.webstore.services.Impl;

import com.jd.webstore.domains.Product;
import com.jd.webstore.repositories.ProductRepository;
import com.jd.webstore.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    ProductRepository productRepository;


    @Override
    public void processOrder(String productId, Integer count) {

        Product productById = productRepository.getProductById(productId);

        if (productById.getUnitsInStock() < count) {

            throw new IllegalArgumentException("Zbyt mało towaru. Obecna liczba sztuk w magazynie: " + productById.getUnitsInStock());
        }

        productById.setUnitsInStock(productById.getUnitsInStock() - count);
    }
}
