package com.tp3.billingservice.entities;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.tp3.billingservice.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class ProductItem{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private long productID;

    private double price;

    private double quantity;

    @ManyToOne
    @JoinColumn(name = "productItem_id")
    @JsonIncludeProperties(value = {"id","billingDate","customerID","customer"})
    private Bill bill;

    @Transient
    private Product product;
}
