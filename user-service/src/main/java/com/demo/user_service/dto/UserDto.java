package com.demo.user_service.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {
    private int userId;
    private String name;
    private List<OrderDto> orders;
}