package com.logisticsSystem.proyect.repositories.repositoryStates;

 import com.logisticsSystem.proyect.entities.States;
import org.springframework.data.jpa.repository.JpaRepository;
 import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryStates extends JpaRepository<States,Long> {

}
