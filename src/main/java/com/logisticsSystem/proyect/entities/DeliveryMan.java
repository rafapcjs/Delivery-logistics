package com.logisticsSystem.proyect.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "delivery_man")
public class DeliveryMan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "code", nullable = false)
    private String code;
    @Column(name = "email", nullable = false)

    private String email;
    @Column(name = "passworrd", nullable = false)
    private String password;
    @OneToMany(mappedBy = "deliveryMan", fetch = FetchType.LAZY, orphanRemoval = true, targetEntity = Orders.class, cascade = CascadeType.ALL)
   @JsonIgnore
    private List<Orders> ordesList;



}