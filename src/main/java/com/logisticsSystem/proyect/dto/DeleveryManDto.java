package com.logisticsSystem.proyect.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.logisticsSystem.proyect.entities.Customers;
import com.logisticsSystem.proyect.entities.Orders;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeleveryManDto {




    private String name;

    private String code;

    private String email;

    private String password;

    private List<Orders> ordesList;
}
