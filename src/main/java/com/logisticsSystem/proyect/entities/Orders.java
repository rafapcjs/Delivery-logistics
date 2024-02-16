package com.logisticsSystem.proyect.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "cost", nullable = false)
    private Long cost;

    @Column(name = "product_name", nullable = false)

    private String productName;

    @ManyToOne(targetEntity = Customers.class)

    @JoinColumn(name = "id_customer", nullable = false)
    @JsonIgnore
    private Customers customers;


    @ManyToOne(targetEntity = States.class)
    @JoinColumn(name = "id_states",nullable = false)
   @JsonIgnore
    private States states;


    @ManyToOne(targetEntity = DeliveryMan.class)
    @JoinColumn(nullable = false,name = "id_delivery")
    @JsonIgnore
    private DeliveryMan deliveryMan;
}