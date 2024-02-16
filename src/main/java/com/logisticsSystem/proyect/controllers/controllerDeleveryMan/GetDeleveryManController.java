package com.logisticsSystem.proyect.controllers.controllerDeleveryMan;

import com.logisticsSystem.proyect.dto.DeleveryManDto;
import com.logisticsSystem.proyect.services.servicesDeleveryMan.ImplServicesDeleveryMan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/delevery")
public class GetDeleveryManController {
    @Autowired
    private ImplServicesDeleveryMan implServicesDeleveryMan;

    @GetMapping(value = "/getAll")

    public ResponseEntity<?> getAll(@RequestBody DeleveryManDto deleveryManDto) throws Exception {

        List<DeleveryManDto> findAll = implServicesDeleveryMan.findAll().stream().map(deliveryMan -> DeleveryManDto.builder()

                .name(deleveryManDto.getName())
                .email(deleveryManDto.getEmail())
                .code(deleveryManDto.getCode())

                .ordesList(deleveryManDto.getOrdesList())

                .build()
        ).toList();

        return ResponseEntity.ok(findAll);

    }
}

