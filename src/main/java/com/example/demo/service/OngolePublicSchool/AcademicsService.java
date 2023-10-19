package com.example.demo.service.OngolePublicSchool;

import com.example.demo.entity.OngolePublicSchool.Academics;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.OngolePublicSchool.AcademicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademicsService {
    @Autowired
    private AcademicsRepository academicsRepository;

    public List<Academics> getAllAcademicsData(){
        return academicsRepository.findAll();
    }

    public void addAcademics(Academics academics){
        System.out.println(academics);
        academicsRepository.save(academics);
    }

    public Academics deleteAcademics(String academicsId){
        Academics academics = academicsRepository.findById(academicsId).orElseThrow(
                () -> new ResourceNotFoundException("academics is not found with academics Id: " + academicsId)
        );
        academicsRepository.delete(academics);
        return academics;
    }

    public Academics getAcademics(String academicsId){
        return academicsRepository.findById(academicsId).orElseThrow(
                () -> new ResourceNotFoundException("academics is not found with academics Id: " + academicsId)
        );
    }

    public Academics updateAcademics(String academicsId, Academics academics) {
        Academics updateAcademics = academicsRepository.findById(academicsId).orElseThrow(
                () -> new ResourceNotFoundException("academics is not found with academics id: " + academicsId)
        );
        updateAcademics.setAcademicsId(academics.getAcademicsId());
        updateAcademics.setScienceWhere(academics.getScienceWhere());
        updateAcademics.setFoods(academics.getFoods());
        System.out.println(updateAcademics);
        academicsRepository.save(updateAcademics);
        return updateAcademics;
    }

    public List<Object> getAllAcademicsList(){
        return academicsRepository.allAcademicsList();
    }

}
