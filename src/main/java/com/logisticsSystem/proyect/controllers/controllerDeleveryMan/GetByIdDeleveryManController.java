package com.logisticsSystem.proyect.controllers.controllerDeleveryMan;

import com.logisticsSystem.proyect.dto.DeleveryManDto;
import com.logisticsSystem.proyect.entities.DeliveryMan;
import com.logisticsSystem.proyect.services.servicesDeleveryMan.ImplServicesDeleveryMan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/delevery")
public class GetByIdDeleveryManController {
    @Autowired
    private ImplServicesDeleveryMan implServicesDeleveryMan;
    @GetMapping(value = "/findById/{id}")

    public ResponseEntity<?>findById(@PathVariable Long id){

        Optional<DeliveryMan>findId= implServicesDeleveryMan.findById(id);

        if (findId.isPresent()){

            DeliveryMan deliveryMan = findId.get();
            DeleveryManDto deleveryManDto= DeleveryManDto.builder()
                    .name(deliveryMan.getName())
                    .email(deliveryMan.getEmail())
                    .ordesList(deliveryMan.getOrdesList())

                    .build();
            return ResponseEntity.ok(deliveryMan);



        }
        return  ResponseEntity.notFound().build();
    }
}
