package com.logisticsSystem.proyect.repositories.repositoryDeliveryMan;

import com.logisticsSystem.proyect.entities.Customers;
import com.logisticsSystem.proyect.entities.DeliveryMan;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryDeliveryMan extends CrudRepository<DeliveryMan,Long> {
   // order by name
    @Query("SELECT dm FROM DeliveryMan dm ORDER BY dm.name")
    List<DeliveryMan> findAllOrderedAlphabetically();
}
