package com.example.demo.service;

import com.example.demo.entity.Electronics;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.ElectronicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElectronicsService {
    @Autowired
    private ElectronicsRepository electronicsRepository;

    public List<Electronics> getAllElectronicsData(){
        return electronicsRepository.findAll();
    }

    public void addElectronics(Electronics electronics){
        electronicsRepository.save(electronics);
    }

    public Electronics deleteelectronics(String electronicsId){
        Electronics electronics = electronicsRepository.findById(electronicsId).orElseThrow(
                () -> new ResourceNotFoundException("electronics is not found with id: " + electronicsId)
        );
        electronicsRepository.delete(electronics);
        return electronics;
    }

    public Electronics getElectronicsById(String electronicsId){
        return electronicsRepository.findById(electronicsId).orElseThrow(
                () -> new ResourceNotFoundException("electronics is not found with id: " + electronicsId)
        );
    }

    public Electronics updateElectronics(String electronicsId, Electronics electronics) {
        Electronics updateElectronics = electronicsRepository.findById(electronicsId).orElseThrow(
                () -> new ResourceNotFoundException("electronics is not found with id: " + electronicsId)
        );
        updateElectronics.setMobileDevices(electronics.getMobileDevices());
        updateElectronics.setWearables(electronics.getWearables());
        updateElectronics.setTv(electronics.getTv());
        updateElectronics.setSetUpBoxes(electronics.getSetUpBoxes());
        updateElectronics.setMonitors(electronics.getMonitors());
        updateElectronics.setLaptops(electronics.getLaptops());
        updateElectronics.setTablets(electronics.getTablets());
        updateElectronics.setComputers(electronics.getComputers());
        updateElectronics.setPrinters(electronics.getPrinters());
        updateElectronics.setScanners(electronics.getScanners());
        electronicsRepository.save(updateElectronics);
        return updateElectronics;
    }

}
