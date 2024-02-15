package com.logisticsSystem.proyect.controllers.controllerDeleveryMan;

import com.logisticsSystem.proyect.services.servicesDeleveryMan.ImplServicesDeleveryMan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/delevery")
public class GetDeleveryManController {
    @Autowired
    private ImplServicesDeleveryMan implServicesDeleveryMan;
}

