package com.example.demo.service.restaurant;

import com.example.demo.entity.restaurant.Rent;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.restaurant.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class RentService {
    @Autowired
    private RentRepository rentRepository;

    public List<Rent> getAllRentData(){
        return rentRepository.findAll();
    }

    public void addRent(Rent rent){
        System.out.println(rent);
        rentRepository.save(rent);
    }

    public Rent deleteRent(String rentId){
        Rent rent = rentRepository.findById(rentId).orElseThrow(
                () -> new ResourceNotFoundException("rent is not found with rent id: " + rentId)
        );
        rentRepository.delete(rent);
        return rent;
    }

    public Rent getRentByRentId(String rentId){
        return rentRepository.findById(rentId).orElseThrow(
                () -> new ResourceNotFoundException("rent is not found with rent id: " + rentId)
        );
    }

    public Rent updateRent(String rentId, Rent rent) {
        Rent updateRent = rentRepository.findById(rentId).orElseThrow(
                () -> new ResourceNotFoundException("rent is not found with rent id: " + rentId)
        );
        updateRent.setRentId(rent.getRentId());
        updateRent.setAddress(rent.getAddress());
        updateRent.setAmount(rent.getAmount());
        updateRent.setAdvanced(rent.getAdvanced());
        updateRent.setYear(rent.getYear());
        updateRent.setDate(rent.getDate());
        rentRepository.save(updateRent);
        return updateRent;
    }

    public List<Object> getAllRentRentsList(){
        return rentRepository.allRentList();
    }

}
