package com.example.demo.service.OngolePublicSchool;

import com.example.demo.entity.OngolePublicSchool.Fees;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.OngolePublicSchool.FeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeesService {
    @Autowired
    private FeesRepository feesRepository;

    public List<Fees> getAllFeesData(){
        return feesRepository.findAll();
    }

    public void addFees(Fees fees){
        System.out.println(fees);
        feesRepository.save(fees);
    }

    public Fees deleteFees(String feesId){
        Fees fees = feesRepository.findById(feesId).orElseThrow(
                () -> new ResourceNotFoundException("fees is not found with fees Id: " + feesId)
        );
        feesRepository.delete(fees);
        return fees;
    }

    public Fees getFees(String feesId){
        return feesRepository.findById(feesId).orElseThrow(
                () -> new ResourceNotFoundException("fees is not found with fees Id: " + feesId)
        );
    }

    public Fees updateFees(String feesId, Fees fees) {
        Fees updateFees = feesRepository.findById(feesId).orElseThrow(
                () -> new ResourceNotFoundException("fees is not found with fees id: " + feesId)
        );
        updateFees.setFeesId(fees.getFeesId());
        updateFees.setStudentsFees(fees.getStudentsFees());
        updateFees.setBooksFees(fees.getBooksFees());
        updateFees.setGamesFees(fees.getGamesFees());
        updateFees.setDressFees(fees.getDressFees());
        updateFees.setTuitionFees(fees.getTuitionFees());
        updateFees.setDate(fees.getDate());
        System.out.println(updateFees);
        feesRepository.save(updateFees);
        return updateFees;
    }

    public List<Object> getAllFeesList(){
        return feesRepository.allFeesList();
    }

}
