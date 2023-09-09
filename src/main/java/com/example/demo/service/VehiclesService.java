package com.example.demo.service;

import com.example.demo.entity.Vehicles;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.VehiclesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiclesService {
    @Autowired
    private VehiclesRepository vehiclesRepository;

    public List<Vehicles> getAllVehiclesData(){
        return vehiclesRepository.findAll();
    }

    public void addVehicles(Vehicles vehicles){
        vehiclesRepository.save(vehicles);
    }

    public Vehicles deleteVehicles(String vehiclesId){
        Vehicles vehicles = vehiclesRepository.findById(vehiclesId).orElseThrow(
                () -> new ResourceNotFoundException("Person is not found with id: " + vehiclesId)
        );
        vehiclesRepository.delete(vehicles);
        return vehicles;
    }

    public Vehicles getVehiclesById(String vehiclesId){
        return vehiclesRepository.findById(vehiclesId).orElseThrow(
                () -> new ResourceNotFoundException("Person is not found with id: " + vehiclesId)
        );
    }

    public Vehicles updateVehicles(String vehiclesId, Vehicles vehicles) {
        Vehicles updateVehicles = vehiclesRepository.findById(vehiclesId).orElseThrow(
                () -> new ResourceNotFoundException("Vehicles is not found with id: " + vehiclesId)
        );
        updateVehicles.setVehicleId(vehicles.getVehicleId());
        updateVehicles.setVehicleName(vehicles.getVehicleName());
        updateVehicles.setTwoWheelers(vehicles.getTwoWheelers());
        updateVehicles.setThreeWheelers(vehicles.getThreeWheelers());
        updateVehicles.setFourWheelers(vehicles.getFourWheelers());
        updateVehicles.setBicycles(vehicles.getBicycles());
        updateVehicles.setMotorbikesstreet(vehicles.getMotorbikesstreet());
        updateVehicles.setCars(vehicles.getCars());

        vehiclesRepository.save(updateVehicles);
        return updateVehicles;
    }

}
