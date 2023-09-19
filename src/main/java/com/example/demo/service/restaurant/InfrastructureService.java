package com.example.demo.service.restaurant;

import com.example.demo.entity.restaurant.Infrastructure;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.restaurant.InfrastructureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
@Service
public class InfrastructureService {
    @Autowired
    private InfrastructureRepository infrastructureRepository;

    public List<Infrastructure> getAllInfrastructureData(){
        return infrastructureRepository.findAll();
    }

    public void addInfrastructure(Infrastructure infrastructure){
        System.out.println(infrastructure);
        infrastructureRepository.save(infrastructure);
    }

    public Infrastructure deleteInfrastructure(String itemId){
        Infrastructure infrastructure = infrastructureRepository.findById(itemId).orElseThrow(
                () -> new ResourceNotFoundException("infrastructure is not found with item id: " + itemId)
        );
        infrastructureRepository.delete(infrastructure);
        return infrastructure;
    }

    public Infrastructure getInfrastructureByItemId(String itemId){
        return infrastructureRepository.findById(itemId).orElseThrow(
                () -> new ResourceNotFoundException("infrastructure is not found with item id: " + itemId)
        );
    }

    public Infrastructure updateInfrastructure(String itemId, Infrastructure infrastructure) {
        Infrastructure updateInfrastructure = infrastructureRepository.findById(itemId).orElseThrow(
                () -> new ResourceNotFoundException("infrastructure is not found with item id: " + itemId)
        );
        updateInfrastructure.setItemId(infrastructure.getItemId());
        updateInfrastructure.setTables(infrastructure.getTables());
        updateInfrastructure.setCost(infrastructure.getCost());updateInfrastructure.setItemId(infrastructure.getItemId());
        updateInfrastructure.setLights(infrastructure.getLights());
        updateInfrastructure.setFans(infrastructure.getFans());
        updateInfrastructure.setNumberOfItemsAvailable(infrastructure.getNumberOfItemsAvailable());
        updateInfrastructure.setDate(infrastructure.getDate());
        infrastructureRepository.save(updateInfrastructure);
        return updateInfrastructure;
    }

    public List<Object> getAllInfrastructureItemsList(){
        return infrastructureRepository.allInfrastructureItemsList();
    }

}
