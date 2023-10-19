package com.example.demo.service.OngolePublicSchool;

import com.example.demo.entity.OngolePublicSchool.Salaries;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.OngolePublicSchool.SalariesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalariesService {
    @Autowired
    private SalariesRepository salariesRepository;

    public List<Salaries> getAllSalariesData(){
        return salariesRepository.findAll();
    }

    public void addSalaries(Salaries salaries){
        System.out.println(salaries);
        salariesRepository.save(salaries);
    }

    public Salaries deleteSalaries(String salariesId){
        Salaries salaries = salariesRepository.findById(salariesId).orElseThrow(
                () -> new ResourceNotFoundException("salaries is not found with salaries Id: " + salariesId)
        );
        salariesRepository.delete(salaries);
        return salaries;
    }

    public Salaries getSalaries(String salariesId){
        return salariesRepository.findById(salariesId).orElseThrow(
                () -> new ResourceNotFoundException("salaries is not found with salaries Id: " + salariesId)
        );
    }

    public Salaries updateSalaries(String salariesId, Salaries salaries) {
        Salaries updateSalaries = salariesRepository.findById(salariesId).orElseThrow(
                () -> new ResourceNotFoundException("salaries is not found with salaries id: " + salariesId)
        );
        updateSalaries.setSalariesId(salaries.getSalariesId());
        updateSalaries.setDate(salaries.getDate());
        updateSalaries.setStaffsSal(salaries.getStaffsSal());
        updateSalaries.setNonStaffsSal(salaries.getNonStaffsSal());
        updateSalaries.setPf(salaries.getPf());
        System.out.println(updateSalaries);
        salariesRepository.save(updateSalaries);
        return updateSalaries;
    }

    public List<Object> getAllSalariesList(){
        return salariesRepository.allSalariesList();
    }

}
