package com.logisticsSystem.proyect.repositories.repositoryCustomer;

import com.logisticsSystem.proyect.entities.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCustomer extends JpaRepository<Customers,Long> {

}
