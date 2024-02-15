package com.logisticsSystem.proyect.services.servicesCustomers;

import com.logisticsSystem.proyect.dao.daoCustomers.ImplDaoCustomers;
import com.logisticsSystem.proyect.entities.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ImplServicesCustomers implements ServicesCustomers{
    @Autowired
    private ImplDaoCustomers implDaoCustomers;

    @Override
    public void save(Customers customers) {
        implDaoCustomers.save(customers);
    }

    @Override
    public Optional<Customers> findById(Long id) {
        return implDaoCustomers.findById(id);
    }
}
