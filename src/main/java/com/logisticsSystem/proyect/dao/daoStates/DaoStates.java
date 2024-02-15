package com.logisticsSystem.proyect.dao.daoStates;

import com.logisticsSystem.proyect.entities.States;

import java.util.Optional;

public interface DaoStates {
    void save (States states);
    Optional<States>findById(Long id);
}
