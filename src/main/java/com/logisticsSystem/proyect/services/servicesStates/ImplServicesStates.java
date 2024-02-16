package com.logisticsSystem.proyect.services.servicesStates;

import com.logisticsSystem.proyect.dao.daoStates.ImplDaoStates;
import com.logisticsSystem.proyect.entities.States;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ImplServicesStates  implements  ServicesStates{

    @Autowired
    private ImplDaoStates implDaoStates;

    @Override
    public void save(States states) {
        implDaoStates.save(states);
    }

    @Override
    public Optional<States> findById(Long id) {
        return implDaoStates.findById(id);
    }
}
