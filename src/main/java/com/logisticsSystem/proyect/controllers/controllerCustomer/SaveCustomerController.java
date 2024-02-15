package com.logisticsSystem.proyect.controllers.controllerCustomer;

import com.logisticsSystem.proyect.dto.CustomersDto;
import com.logisticsSystem.proyect.entities.Customers;
import com.logisticsSystem.proyect.services.servicesCustomers.ImplServicesCustomers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping( value = "/api/v1/customer")
public class SaveCustomerController {

    @Autowired
    private ImplServicesCustomers implServicesCustomers ;
    @PostMapping(value = "/save")

    public ResponseEntity<?> save(@RequestBody CustomersDto customersDto) throws URISyntaxException {

        Customers customers= Customers.builder()
                .name(customersDto.getName())
                .identification(customersDto.getIdentification())
                .ordersList(customersDto.getOrdersList())

                .build();
implServicesCustomers.save(customers);
        return ResponseEntity.created(new URI("/api/v1/customer/save")).build();

    }
}
