package com.example.demo.service;

import com.example.demo.entity.Relatives;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.RelativesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RelativesService {
    @Autowired
    private RelativesRepository relativesRepository;

    public List<Relatives> getAllRelativesData(){
        return relativesRepository.findAll();
    }

    public void addRelatives(Relatives relatives){
        relativesRepository.save(relatives);
    }

    public Relatives deleterelatives(String relativesId){
        Relatives relatives = relativesRepository.findById(relativesId).orElseThrow(
                () -> new ResourceNotFoundException("relatives is not found with id: " + relativesId)
        );
        relativesRepository.delete(relatives);
        return relatives;
    }

    public Relatives getRelativesById(String relativesId){
        return relativesRepository.findById(relativesId).orElseThrow(
                () -> new ResourceNotFoundException("relatives is not found with id: " + relativesId)
        );
    }

    public Relatives updaterelatives(String relativesId, Relatives relatives) {
        Relatives updateRelatives = relativesRepository.findById(relativesId).orElseThrow(
                () -> new ResourceNotFoundException("Relatives is not found with id: " + relativesId)
        );
        updateRelatives.setRelativesId(relatives.getRelativesId());
        updateRelatives.setRelativeFirstName(relatives.getRelativeFirstName());
        updateRelatives.setRelativeMiddleName(relatives.getRelativeMiddleName());
        updateRelatives.setRelativeLastName(relatives.getRelativeLastName());
        updateRelatives.setDob(relatives.getDob());
        updateRelatives.setStreet(relatives.getStreet());
        updateRelatives.setLandMark(relatives.getCity());
        updateRelatives.setState(relatives.getState());
        updateRelatives.setCountry(relatives.getCountry());
        updateRelatives.setZipcode(relatives.getZipcode());
        updateRelatives.setTimezone(relatives.getTimezone());
        relativesRepository.save(updateRelatives);
        return updateRelatives;
    }

}
