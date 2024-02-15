package com.logisticsSystem.proyect.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class StatesDto {

    private Long id;

    private String state;

    private String description;

    private List<Orders> ordersList;
}
