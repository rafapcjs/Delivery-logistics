package com.logisticsSystem.proyect.controllers.controllerStates;

import com.logisticsSystem.proyect.dto.StatesDto;
import com.logisticsSystem.proyect.entities.States;
import com.logisticsSystem.proyect.services.servicesOrders.ImplServicesOrders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping(value = "/api/v1/states")
public class SaveStateStatesController {

    @Autowired

    private ImplServicesOrders implServicesOrders;

    @PostMapping(value = "/save")

    public ResponseEntity<?>save(@RequestBody StatesDto  statesDto) throws URISyntaxException {

        States states = States.builder()
                .description(statesDto.getDescription())
                .ordersList(statesDto.getOrdersList())
                .state(statesDto.getState())
                .build();
        return ResponseEntity.created(new URI("/api/v1/states/save")).build();
    }
}
