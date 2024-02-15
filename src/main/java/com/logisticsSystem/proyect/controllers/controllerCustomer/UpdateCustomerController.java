package com.logisticsSystem.proyect.controllers.controllerCustomer;

import com.logisticsSystem.proyect.dto.CustomersDto;
import com.logisticsSystem.proyect.entities.Customers;
import com.logisticsSystem.proyect.services.servicesCustomers.ImplServicesCustomers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/customer")
public class UpdateCustomerController {
    @Autowired
    private ImplServicesCustomers implServicesCustomers ;
    @PutMapping(value = "/update/{id}")

    public ResponseEntity<?>update (@PathVariable Long id, @RequestBody CustomersDto customersDto){
        Optional<Customers>findByIdExists=implServicesCustomers.findById(id);
        if (findByIdExists.isPresent()){

            Customers customers= findByIdExists.get();
            customers.setName(customersDto.getName());
            customers.setIdentification(customersDto.getIdentification());
            return  new ResponseEntity<>(customers, HttpStatus.CREATED);
        }
        return ResponseEntity.status(HttpStatus.OK).body("Resourse no found ".concat("the id is"+"  "+id));
    }


}
