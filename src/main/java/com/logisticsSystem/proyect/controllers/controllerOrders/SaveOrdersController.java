package com.logisticsSystem.proyect.controllers.controllerOrders;

import com.logisticsSystem.proyect.dto.OrdersDto;
import com.logisticsSystem.proyect.entities.Orders;
import com.logisticsSystem.proyect.services.servicesOrders.ImplServicesOrders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping(value = "/api/v1/orders")
public class SaveOrdersController {
    @Autowired
    private ImplServicesOrders implServicesOrders;


    @PostMapping(value = "/save")
    public ResponseEntity<?>saves(@RequestBody OrdersDto ordersDto) throws URISyntaxException {

        Orders orders = Orders.builder()
                .cost(ordersDto.getCost())
                .customers(ordersDto.getCustomers())
                                 .productName(ordersDto.getProductName())

                .states(ordersDto.getStates())
                .build();
        return  ResponseEntity.created(new URI("/api/v1/orders/save")).build();


    }



}
