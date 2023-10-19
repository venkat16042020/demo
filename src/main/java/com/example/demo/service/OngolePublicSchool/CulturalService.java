package com.example.demo.service.OngolePublicSchool;

import com.example.demo.entity.OngolePublicSchool.Cultural;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.OngolePublicSchool.CulturalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CulturalService {
    @Autowired
    private CulturalRepository culturalRepository;

    public List<Cultural> getAllCulturalData(){
        return culturalRepository.findAll();
    }

    public void addCultural(Cultural cultural){
        System.out.println(cultural);
        culturalRepository.save(cultural);
    }

    public Cultural deleteCultural(String culturalId){
        Cultural cultural = culturalRepository.findById(culturalId).orElseThrow(
                () -> new ResourceNotFoundException("cultural is not found with cultural Id: " + culturalId)
        );
        culturalRepository.delete(cultural);
        return cultural;
    }

    public Cultural getCultural(String culturalId){
        return culturalRepository.findById(culturalId).orElseThrow(
                () -> new ResourceNotFoundException("cultural is not found with cultural Id: " + culturalId)
        );
    }

    public Cultural updateCultural(String culturalId, Cultural cultural) {
        Cultural updateCultural = culturalRepository.findById(culturalId).orElseThrow(
                () -> new ResourceNotFoundException("cultural is not found with cultural id: " + culturalId)
        );
        updateCultural.setCulturalId(cultural.getCulturalId());
        updateCultural.setVentriloquy(cultural.getVentriloquy());
        updateCultural.setMime(cultural.getMime());
        updateCultural.setLiveArt(cultural.getLiveArt());
        updateCultural.setStandUpComedy(cultural.getStandUpComedy());
        updateCultural.setClassicalInstrumentalMusic(cultural.getClassicalInstrumentalMusic());
        updateCultural.setACapella(cultural.getACapella());
        updateCultural.setDate(cultural.getDate());
        System.out.println(updateCultural);
        culturalRepository.save(updateCultural);
        return updateCultural;
    }

    public List<Object> getAllCulturalList(){
        return culturalRepository.allCulturalList();
    }

}
