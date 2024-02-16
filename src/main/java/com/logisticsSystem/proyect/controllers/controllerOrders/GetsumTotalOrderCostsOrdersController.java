package com.logisticsSystem.proyect.controllers.controllerOrders;

import com.logisticsSystem.proyect.services.servicesOrders.ImplServicesOrders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/orders")
public class GetsumTotalOrderCostsOrdersController {
    @Autowired
    private ImplServicesOrders implServicesOrders;

    @GetMapping(value = "/countSum")
    public ResponseEntity<?> countAllSum() {
        Double countSum = implServicesOrders.sumTotalOrderCosts();
        if (countSum != null) {
            return ResponseEntity.ok("La cantidad de la suma total es" + " $$" + countSum);

        }

        return ResponseEntity.notFound().build();
    }
}
