package com.logisticsSystem.proyect.dao.daoDeliveryMan;

import com.logisticsSystem.proyect.entities.DeliveryMan;
import com.logisticsSystem.proyect.repositories.repositoryDeliveryMan.RepositoryDeliveryMan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ImplDaoDeleveryMan implements  DaoDeleveryMan{
    @Autowired
    private RepositoryDeliveryMan repositoryDeliveryMan;
    @Override
    public List<DeliveryMan> findAll() {
        return (List<DeliveryMan>) repositoryDeliveryMan.findAll();
    }

    @Override
    public Optional<DeliveryMan> findById(Long id) {
        return repositoryDeliveryMan.findById(id);
    }

    @Override
    public void save(DeliveryMan deliveryMan) {
        repositoryDeliveryMan.save(deliveryMan);
    }

    @Override
    public List<DeliveryMan> findAllOrderedAlphabetically() {
        return repositoryDeliveryMan.findAllOrderedAlphabetically();
    }
}
