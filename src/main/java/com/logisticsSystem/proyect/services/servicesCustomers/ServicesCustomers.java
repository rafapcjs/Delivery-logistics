package com.logisticsSystem.proyect.services.servicesCustomers;

import com.logisticsSystem.proyect.entities.Customers;

import java.util.Optional;

public interface ServicesCustomers {
    void save(Customers customers);
    Optional<Customers>findById(Long id);
}
