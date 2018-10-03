package com.jd.webstore.repositories;

import com.jd.webstore.domain.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> getAllProducts();
}
