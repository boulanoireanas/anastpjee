package com.tp3.billingservice.feign;

import com.tp3.billingservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="PRODUCT-SERVICE")
public interface InventoryServiceClient {
    @GetMapping("/products/{id}?projection=fullProduct")
    Product findProductById(@PathVariable("id") Long id);

    @GetMapping("/products")
    PagedModel<Product> pageProducts(/*@RequestParam(value = "page") int page,@RequestParam(value = "size") int size*/);

    @GetMapping("/products?projection=fullProduct")
    PagedModel<Product> findAll();
}
