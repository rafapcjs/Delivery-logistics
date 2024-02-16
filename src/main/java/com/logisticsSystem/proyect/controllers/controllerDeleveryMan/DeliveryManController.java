package com.logisticsSystem.proyect.controllers.controllerDeleveryMan;

import com.logisticsSystem.proyect.dto.DeleveryManDto;
import com.logisticsSystem.proyect.services.servicesDeleveryMan.ImplServicesDeleveryMan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(value = "/api/v1/delivery")
public class DeliveryManController {

    @Autowired
    private ImplServicesDeleveryMan implServicesDeleveryMan;

    @GetMapping(value = "/orders")
    public ResponseEntity<?> getOrders() {
        List<DeleveryManDto> findAllOrder = implServicesDeleveryMan.findAllOrderedAlphabetically()
                .stream()
                .map(deliveryMan -> DeleveryManDto.builder()
                        .name(deliveryMan.getName())
                        .code(deliveryMan.getCode())
                        .email(deliveryMan.getEmail())
                        .ordesList(deliveryMan.getOrdesList())
                        .build())
                .toList();

        if (findAllOrder.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(findAllOrder);
    }
}
