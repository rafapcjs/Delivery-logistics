package com.logisticsSystem.proyect.controllers.controllerDeleveryMan;

import com.logisticsSystem.proyect.dto.DeleveryManDto;
import com.logisticsSystem.proyect.entities.DeliveryMan;
import com.logisticsSystem.proyect.services.servicesDeleveryMan.ImplServicesDeleveryMan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping(value = "/api/v1/delevery")
public class SaveDeleveryMan {
    @Autowired
    private ImplServicesDeleveryMan implServicesDeleveryMan;

    @PostMapping(value = "/save")

    public ResponseEntity<?>save (@RequestBody DeleveryManDto deleveryManDto) throws URISyntaxException {

        DeliveryMan deliveryMan= DeliveryMan.builder()
                .name(deleveryManDto.getName())
                .code(deleveryManDto.getCode())
                .ordesList(deleveryManDto.getOrdesList())
                .password(deleveryManDto.getPassword())

                .build();
        implServicesDeleveryMan.save(deliveryMan);

        return  ResponseEntity.created(new URI("/api/v1/delevery/save")).build();
    }
}
