package com.example.demo.service.OngolePublicSchool;

import com.example.demo.entity.OngolePublicSchool.Classes;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.OngolePublicSchool.ClassesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassesService {
    @Autowired
    private ClassesRepository classesRepository;

    public List<Classes> getAllClassesData(){
        return classesRepository.findAll();
    }

    public void addClasses(Classes classes){
        System.out.println(classes);
        classesRepository.save(classes);
    }

    public Classes deleteClasses(String classesId){
        Classes classes = classesRepository.findById(classesId).orElseThrow(
                () -> new ResourceNotFoundException("classes is not found with classes Id: " + classesId)
        );
        classesRepository.delete(classes);
        return classes;
    }

    public Classes getClasses(String classesId){
        return classesRepository.findById(classesId).orElseThrow(
                () -> new ResourceNotFoundException("classes is not found with classes Id: " + classesId)
        );
    }

    public Classes updateClasses(String classesId, Classes classes) {
        Classes updateClasses = classesRepository.findById(classesId).orElseThrow(
                () -> new ResourceNotFoundException("classes is not found with classes id: " + classesId)
        );
        updateClasses.setClassesId(classes.getClassesId());
        updateClasses.setUKg(classes.getUKg());
        updateClasses.setLKg(classes.getLKg());
        updateClasses.setFirstClass(classes.getFirstClass());
        updateClasses.setSecondClass(classes.getSecondClass());
        updateClasses.setThirdClass(classes.getThirdClass());
        updateClasses.setFourthClass(classes.getFourthClass());
        updateClasses.setFifthClass(classes.getFifthClass());
        updateClasses.setSixthClass(classes.getSixthClass());
        updateClasses.setSeventhClass(classes.getSeventhClass());
        updateClasses.setEightClass(classes.getEightClass());
        updateClasses.setNinthClass(classes.getNinthClass());
        updateClasses.setTenthClass(classes.getTenthClass());
        System.out.println(updateClasses);
        classesRepository.save(updateClasses);
        return updateClasses;
    }

    public List<Object> getAllClassesList(){
        return classesRepository.allClassesList();
    }

}
