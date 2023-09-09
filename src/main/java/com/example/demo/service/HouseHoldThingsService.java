package com.example.demo.service;

import com.example.demo.entity.HouseHoldThings;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.HouseHoldThingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseHoldThingsService {
    @Autowired
    private HouseHoldThingsRepository houseHoldThingsRepository;

    public List<HouseHoldThings> getHouseHoldThingsData() {
        return houseHoldThingsRepository.findAll();
    }

    public void addHouseHoldThings(HouseHoldThings HouseHoldThings) {houseHoldThingsRepository.save(HouseHoldThings);}

    public HouseHoldThings deleteHouseHoldThings(String houseHoldThingsId){
        HouseHoldThings HouseHoldThings = houseHoldThingsRepository.findById(houseHoldThingsId).orElseThrow(
                () -> new ResourceNotFoundException("HouseHoldThings is not found with id: " + houseHoldThingsId)
        );
        houseHoldThingsRepository.delete(HouseHoldThings);
        return HouseHoldThings;
    }

    public HouseHoldThings getHouseHoldThingsById(String HouseHoldThingsId){
        return houseHoldThingsRepository.findById(HouseHoldThingsId).orElseThrow(
                () -> new ResourceNotFoundException("HouseHoldThings is not found with id: " + HouseHoldThingsId)
        );
    }

    public HouseHoldThings UpdateHouseHoldThings(String HouseHoldThingsId, HouseHoldThings HouseHoldThings) {
        HouseHoldThings updateHouseHoldThings = houseHoldThingsRepository.findById(HouseHoldThingsId).orElseThrow(
                () -> new ResourceNotFoundException("HouseHoldThings is not found with id: " + HouseHoldThingsId)
        );
        updateHouseHoldThings.setHouseHoldThingsId(HouseHoldThings.getHouseHoldThingsId());
        updateHouseHoldThings.setToolsAndSupplies(HouseHoldThings.getToolsAndSupplies());
        updateHouseHoldThings.setKitchenEquipment(HouseHoldThings.getKitchenEquipment());
        updateHouseHoldThings.setCleaningSupplies(HouseHoldThings.getCleaningSupplies());
        updateHouseHoldThings.setFurniture(HouseHoldThings.getFurniture());
        updateHouseHoldThings.setDecor(HouseHoldThings.getDecor());
        updateHouseHoldThings.setStorage(HouseHoldThings.getStorage());
        updateHouseHoldThings.setManufactureDate(HouseHoldThings.getManufactureDate());
        updateHouseHoldThings.setExpireDate(HouseHoldThings.getExpireDate());
        updateHouseHoldThings.setWarranty(HouseHoldThings.getWarranty());
        updateHouseHoldThings.setPlace(HouseHoldThings.getPlace());
        updateHouseHoldThings.setPrice(HouseHoldThings.getPrice());
        houseHoldThingsRepository.save(updateHouseHoldThings);
        return updateHouseHoldThings;
    }

}
