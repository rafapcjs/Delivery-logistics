package com.logisticsSystem.proyect.dao.daoCustomers;

import com.logisticsSystem.proyect.entities.Customers;

import java.util.Optional;

public interface DaoCustomers {
    void save(Customers customers);
    Optional<Customers>findById(Long id);
}
