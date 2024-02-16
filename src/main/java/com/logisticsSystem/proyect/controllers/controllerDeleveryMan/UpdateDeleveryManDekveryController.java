package com.logisticsSystem.proyect.controllers.controllerDeleveryMan;

import com.logisticsSystem.proyect.dto.DeleveryManDto;
import com.logisticsSystem.proyect.entities.DeliveryMan;
import com.logisticsSystem.proyect.services.servicesDeleveryMan.ImplServicesDeleveryMan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/delevery")
public class UpdateDeleveryManDekveryController {
    @Autowired
    private ImplServicesDeleveryMan implServicesDeleveryMan;
    @PutMapping("/update/{id}")
    public ResponseEntity<?>update(@PathVariable Long id , @RequestBody DeleveryManDto deleveryManDto){

        Optional<DeliveryMan>findByIdExist = implServicesDeleveryMan.findById(id);

        if (findByIdExist.isPresent()){
            DeliveryMan deliveryMan= findByIdExist.get();
            deliveryMan.setEmail(deliveryMan.getEmail());
            deliveryMan.setName(deliveryMan.getName());

        return ResponseEntity.ok(" you can update a the Deliver".concat("el id es"+"/n"+id));
        }
        return  ResponseEntity.notFound().build();
    }

}
