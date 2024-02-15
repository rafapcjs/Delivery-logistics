package com.logisticsSystem.proyect.services.servicesDeleveryMan;

import com.logisticsSystem.proyect.dao.daoDeliveryMan.ImplDaoDeleveryMan;
import com.logisticsSystem.proyect.entities.DeliveryMan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImplServicesDeleveryMan implements ServicesDeleveryMan {
    @Autowired
    private ImplDaoDeleveryMan implDaoDeleveryMan;
    @Override
    public List<DeliveryMan> findAll() {
        return implDaoDeleveryMan.findAll();
    }

    @Override
    public void save(DeliveryMan deliveryMan) {
        implDaoDeleveryMan.save(deliveryMan);
    }

    @Override
    public Optional<DeliveryMan> findById(Long id) {
        return implDaoDeleveryMan.findById(id);
    }

    @Override
    public List<DeliveryMan> findAllOrderedAlphabetically() {
        return implDaoDeleveryMan.findAllOrderedAlphabetically();
    }
}
