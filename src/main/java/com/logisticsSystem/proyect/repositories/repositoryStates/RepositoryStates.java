package com.logisticsSystem.proyect.repositories.repositoryStates;

import com.logisticsSystem.proyect.entities.Orders;
import com.logisticsSystem.proyect.entities.States;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryStates extends CrudRepository<States,Long> {

}
