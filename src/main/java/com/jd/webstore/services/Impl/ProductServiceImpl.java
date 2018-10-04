package com.jd.webstore.services.Impl;

import com.jd.webstore.domains.Product;
import com.jd.webstore.repositories.ProductRepository;
import com.jd.webstore.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }
}
