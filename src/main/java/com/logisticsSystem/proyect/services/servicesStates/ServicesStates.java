package com.logisticsSystem.proyect.services.servicesStates;

import com.logisticsSystem.proyect.entities.States;

import java.util.Optional;

public interface ServicesStates {
    void save (States states);
    Optional<States>findById(Long id);
}
