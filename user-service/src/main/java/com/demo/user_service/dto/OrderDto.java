package com.demo.user_service.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class OrderDto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    private String product;
    private int price;
    private int uid;
}
