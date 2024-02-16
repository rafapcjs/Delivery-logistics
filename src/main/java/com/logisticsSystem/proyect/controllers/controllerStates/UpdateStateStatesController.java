package com.logisticsSystem.proyect.controllers.controllerStates;

import com.logisticsSystem.proyect.dto.StatesDto;
import com.logisticsSystem.proyect.entities.States;
import com.logisticsSystem.proyect.services.servicesStates.ImplServicesStates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/states")
public class UpdateStateStatesController {
    @Autowired
    private ImplServicesStates implServicesStates;
@PutMapping(value = "update/{id}")
public ResponseEntity<?>update(@PathVariable Long id, @RequestBody StatesDto statesDto)
{
    Optional<States> findByExist = implServicesStates.findById(id);
    if (findByExist.isPresent()){
        States states = findByExist.get();
        states.setState(statesDto.getState());
        states.setDescription(statesDto.getDescription());
        states.setOrdersList(statesDto.getOrdersList());

        implServicesStates.save(states);
        return  ResponseEntity.ok(" the updates is good"+id );
    }
return ResponseEntity.notFound().build();
}







}
