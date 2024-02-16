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
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "dni",nullable = false)
    private String identification;
    //orphanRemoval = true cuando se remueva se remueva todo y sus ordes
    @OneToMany(mappedBy = "customers",targetEntity = Orders.class ,cascade = CascadeType.ALL , fetch = FetchType.LAZY,orphanRemoval = true)
    @JsonIgnore
    private List<Orders>ordersList;



}
