package com.logisticsSystem.proyect.services.servicesDeleveryMan;

import com.logisticsSystem.proyect.entities.DeliveryMan;

import java.util.List;
import java.util.Optional;

public interface ServicesDeleveryMan {
    List<DeliveryMan>findAll();
    void  save (DeliveryMan deliveryMan );
    Optional<DeliveryMan>findById(Long id);

    List<DeliveryMan> findAllOrderedAlphabetically();
}
