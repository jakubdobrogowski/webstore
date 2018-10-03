package com.jd.webstore.repositories;

import com.jd.webstore.domains.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> getAllProducts();

    Product getProductById(String productId);
}
