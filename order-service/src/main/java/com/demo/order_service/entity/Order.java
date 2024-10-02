package com.demo.order_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    private String product;
    private int price;
}
