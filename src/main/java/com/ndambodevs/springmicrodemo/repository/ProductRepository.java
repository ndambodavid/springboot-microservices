package com.ndambodevs.springmicrodemo.repository;

import com.ndambodevs.springmicrodemo.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
