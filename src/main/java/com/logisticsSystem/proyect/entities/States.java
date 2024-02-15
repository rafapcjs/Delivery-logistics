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
public class States {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "state", nullable = false)
    private String state;
    @Column(name = "description", nullable = false)
    private String description;
    @OneToMany(mappedBy = "states", orphanRemoval = true, fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Orders
            .class)
@JsonIgnore
    private List<Orders> ordersList;

}
