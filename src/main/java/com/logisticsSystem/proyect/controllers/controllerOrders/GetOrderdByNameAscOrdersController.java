package com.logisticsSystem.proyect.controllers.controllerOrders;

import com.logisticsSystem.proyect.dto.OrdersDto;
import com.logisticsSystem.proyect.services.servicesOrders.ImplServicesOrders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/orders")
public class GetOrderdByNameAscOrdersController {
    @Autowired
    private ImplServicesOrders implServicesOrders;

    @GetMapping("/findAll")

    public ResponseEntity<?> findAllByNameAsc() {
        List<OrdersDto> findAllOrdersByName = implServicesOrders.findAllOrderedByNameAsc()
                .stream().map(

                        orders -> OrdersDto.builder()

                                .productName(orders.getProductName())
                                .cost(orders.getCost())
                                .states(orders.getStates())

                                .deliveryMan(orders.getDeliveryMan())
                                .build()


                ).toList();
        return ResponseEntity.ok(findAllOrdersByName);
    }
}

