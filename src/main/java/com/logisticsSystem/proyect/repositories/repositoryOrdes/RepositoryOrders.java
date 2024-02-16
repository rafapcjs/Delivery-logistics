package com.logisticsSystem.proyect.repositories.repositoryOrdes;


import com.logisticsSystem.proyect.entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryOrders extends JpaRepository<Orders,Long> {
// sum of all cost

@Query("SELECT SUM(o.cost) FROM Orders o")
Double sumTotalOrderCosts();
    @Query("SELECT o FROM Orders o ORDER BY o.productName ASC")
    List<Orders> findAllOrderedByNameAsc();
}
