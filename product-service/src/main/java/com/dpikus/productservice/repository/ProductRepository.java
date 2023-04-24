package com.dpikus.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dpikus.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
