package com.logisticsSystem.proyect.dao.daoCustomers;

import com.logisticsSystem.proyect.entities.Customers;
import com.logisticsSystem.proyect.repositories.repositoryCustomer.RepositoryCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ImplDaoCustomers implements  DaoCustomers{
    @Autowired
    private RepositoryCustomer repositoryCustomer;
    @Override
    public void save(Customers customers) {
        repositoryCustomer.save(customers);
    }

    @Override
    public Optional<Customers> findById(Long id) {
        return repositoryCustomer.findById(id);
    }
}
