package com.adstracker.onlinesponsoredads.model.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Table(name="products")
@Entity
@Data
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name="product_id")
    private Integer productId;
    @Column(name="product_name")
    private String productName;
}