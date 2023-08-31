package com.spark.productservice.model.repo;

import com.spark.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product,String> {
}
