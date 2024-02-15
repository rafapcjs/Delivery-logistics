package com.logisticsSystem.proyect.dao.daoOrders;

import com.logisticsSystem.proyect.entities.Orders;
import com.logisticsSystem.proyect.repositories.repositoryOrdes.RepositoryOrders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ImplDaoOrders implements  DaoOrders{
    @Autowired
    private RepositoryOrders repositoryOrders;

    @Override
    public void save(Orders orders) {
        repositoryOrders.save(orders);
    }

    @Override
    public void deleteById(Long id) {
repositoryOrders.deleteById(id);
    }

    @Override
    public Double sumTotalOrderCosts() {
        return repositoryOrders.sumTotalOrderCosts();
    }

    @Override
    public List<Orders> findAllOrderedByNameAsc() {
        return repositoryOrders.findAllOrderedByNameAsc();
    }

    @Override
    public Optional<Orders> findById(Long id) {
        return Optional.empty();
    }
}
