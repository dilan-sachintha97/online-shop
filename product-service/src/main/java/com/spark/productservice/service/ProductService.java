package com.spark.productservice.service;

import com.spark.productservice.dto.ProductRequest;
import com.spark.productservice.model.Product;
import com.spark.productservice.model.repo.ProductRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepo productRepo;

    public void createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productRepo.save(product);
        log.info("Product {} is saved",product.getId());
    }



}
