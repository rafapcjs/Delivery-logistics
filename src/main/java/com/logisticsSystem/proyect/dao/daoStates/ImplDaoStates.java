package com.logisticsSystem.proyect.dao.daoStates;

import com.logisticsSystem.proyect.entities.States;
import com.logisticsSystem.proyect.repositories.repositoryStates.RepositoryStates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ImplDaoStates implements DaoStates {
    @Autowired
    private RepositoryStates repositoryStates;
    @Override
    public void save(States states) {
        repositoryStates.save(states);
    }

    @Override
    public Optional<States> findById(Long id) {
        return repositoryStates.findById(id);
    }
}
