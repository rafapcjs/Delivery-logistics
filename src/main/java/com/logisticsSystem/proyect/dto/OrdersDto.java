package com.logisticsSystem.proyect.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.logisticsSystem.proyect.entities.Customers;
import com.logisticsSystem.proyect.entities.DeliveryMan;
import com.logisticsSystem.proyect.entities.States;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrdersDto {



    private Long cost;

    private String delivery;


    private String productName;




    private Customers customers;



    private States states;



    private DeliveryMan deliveryMan;
}
