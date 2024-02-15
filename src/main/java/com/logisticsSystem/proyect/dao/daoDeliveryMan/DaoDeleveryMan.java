package com.logisticsSystem.proyect.dao.daoDeliveryMan;

import com.logisticsSystem.proyect.entities.DeliveryMan;

import java.util.List;
import java.util.Optional;

public interface DaoDeleveryMan {
    List<DeliveryMan>findAll();

    Optional<DeliveryMan>findById(Long id);
void  save (DeliveryMan deliveryMan );
    List<DeliveryMan> findAllOrderedAlphabetically();
}
