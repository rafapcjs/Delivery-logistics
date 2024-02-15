package com.logisticsSystem.proyect.dao.daoOrders;

import com.logisticsSystem.proyect.entities.Orders;

import java.util.List;
import java.util.Optional;

public interface DaoOrders {
    void save (Orders orders);
    void deleteById(Long id);
    Double sumTotalOrderCosts();
    List<Orders> findAllOrderedByNameAsc();
    Optional<Orders>findById(Long id);
}
