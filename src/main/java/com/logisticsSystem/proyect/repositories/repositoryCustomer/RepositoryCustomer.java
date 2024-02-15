package com.logisticsSystem.proyect.repositories.repositoryCustomer;

import com.logisticsSystem.proyect.entities.Customers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCustomer extends CrudRepository<Customers,Long> {

}
