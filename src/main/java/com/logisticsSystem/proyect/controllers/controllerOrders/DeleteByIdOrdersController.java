package com.logisticsSystem.proyect.controllers.controllerOrders;

import com.logisticsSystem.proyect.dto.OrdersDto;
import com.logisticsSystem.proyect.entities.Orders;
import com.logisticsSystem.proyect.services.servicesOrders.ImplServicesOrders;
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
@RequestMapping(value = "/api/v1/orders")
public class DeleteByIdOrdersController {
    @Autowired
    private ImplServicesOrders implServicesOrders;
    @GetMapping(value = "/findById/{id}")
    public ResponseEntity<?>getById(@PathVariable Long id)
    {

        Optional<Orders>findById=implServicesOrders.findById( id);
        if (findById.isPresent()){
            Orders orders =findById.get();
            OrdersDto ordersDto = OrdersDto.builder()
                    .productName(orders.getProductName())
                    .cost(orders.getCost())
                    .customers(orders.getCustomers())
                    .deliveryMan(orders.getDeliveryMan())
                    .states(orders.getStates())

                    .build();
        return new ResponseEntity<>(ordersDto, HttpStatus.OK);

        }
    return  ResponseEntity.noContent().build();
    }

}
