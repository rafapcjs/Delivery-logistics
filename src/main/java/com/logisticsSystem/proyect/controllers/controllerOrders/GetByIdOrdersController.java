package com.logisticsSystem.proyect.controllers.controllerOrders;

import com.logisticsSystem.proyect.dto.OrdersDto;
import com.logisticsSystem.proyect.entities.Orders;
import com.logisticsSystem.proyect.services.servicesDeleveryMan.ImplServicesDeleveryMan;
import com.logisticsSystem.proyect.services.servicesOrders.ImplServicesOrders;
import org.hibernate.query.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/orders")
public class GetByIdOrdersController {
    @Autowired
    private ImplServicesOrders implServicesOrders;
    @GetMapping(value = "/findById/{id}")
public ResponseEntity<?>getId(@PathVariable Long id){
        Optional<Orders>findByIdExist= implServicesOrders.findById(id);

        if (findByIdExist.isPresent()){
            Orders orders = findByIdExist.get();
            OrdersDto ordersDto = OrdersDto.builder()
                    .productName(orders.getProductName())

                    .cost(orders.getCost())
                    .customers(orders.getCustomers())
                    .states(orders.getStates())
                    .deliveryMan(orders.getDeliveryMan())

                    .build();
       return ResponseEntity.ok(findByIdExist);
        }
        return  ResponseEntity.notFound().build();


    }

}

