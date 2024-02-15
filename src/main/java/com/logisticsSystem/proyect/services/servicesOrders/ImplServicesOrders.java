package com.logisticsSystem.proyect.services.servicesOrders;

import com.logisticsSystem.proyect.dao.daoOrders.ImplDaoOrders;
import com.logisticsSystem.proyect.entities.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImplServicesOrders implements  ServicesOrders {
    @Autowired
    private ImplDaoOrders implDaoOrders;
    @Override
    public void save(Orders orders) {
        implDaoOrders.save(orders);
    }

    @Override
    public void deleteById(Long id) {
implDaoOrders.deleteById(id);
    }

    @Override
    public Double sumTotalOrderCosts() {
        return implDaoOrders.sumTotalOrderCosts();
    }

    @Override
    public List<Orders> findAllOrderedByNameAsc() {
        return implDaoOrders.findAllOrderedByNameAsc();
    }

    @Override
    public Optional<Orders> findById(Long id) {
        return implDaoOrders.findById(id);
    }
}
