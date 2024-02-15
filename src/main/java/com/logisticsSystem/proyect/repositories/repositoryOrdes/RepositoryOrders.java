package com.logisticsSystem.proyect.repositories.repositoryOrdes;

import com.logisticsSystem.proyect.entities.DeliveryMan;
import com.logisticsSystem.proyect.entities.Orders;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryOrders extends CrudRepository<Orders,Long> {
// sum of all cost

@Query("SELECT SUM(o.cost) FROM Orders o")
Double sumTotalOrderCosts();
    @Query("SELECT o FROM Orders o ORDER BY o.productName ASC")
    List<Orders> findAllOrderedByNameAsc();
}
