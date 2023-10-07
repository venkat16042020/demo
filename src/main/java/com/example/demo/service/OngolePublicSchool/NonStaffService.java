package com.example.demo.service.OngolePublicSchool;

import com.example.demo.entity.OngolePublicSchool.NonStaff;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.OngolePublicSchool.NonStaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NonStaffService {
    @Autowired
    private NonStaffRepository nonStaffRepository;

    public List<NonStaff> getAllNonStaffData(){
        return nonStaffRepository.findAll();
    }

    public void addNonStaff(NonStaff nonStaff){
        System.out.println(nonStaff);
        nonStaffRepository.save(nonStaff);
    }

    public NonStaff deleteNonStaff(String nonStaffId){
        NonStaff nonStaff = nonStaffRepository.findById(nonStaffId).orElseThrow(
                () -> new ResourceNotFoundException("nonStaff is not found with nonStaff id: " + nonStaffId)
        );
        nonStaffRepository.delete(nonStaff);
        return nonStaff;
    }

    public NonStaff getNonStaffByItemId(String nonStaffId){
        return nonStaffRepository.findById(nonStaffId).orElseThrow(
                () -> new ResourceNotFoundException("nonStaff is not found with nonStaff id: " + nonStaffId)
        );
    }

    public NonStaff updateNonStaff(String nonStaffId, NonStaff nonStaff) {
        NonStaff updateNonStaff = nonStaffRepository.findById(nonStaffId).orElseThrow(
                () -> new ResourceNotFoundException("nonStaff is not found with nonStaff id: " + nonStaffId)
        );
        updateNonStaff.setNonStaffId(nonStaff.getNonStaffId());
        updateNonStaff.setFirstName(nonStaff.getFirstName());
        updateNonStaff.setLastName(nonStaff.getLastName());
        updateNonStaff.setGender(nonStaff.getGender());
        updateNonStaff.setAddress(nonStaff.getAddress());
        updateNonStaff.setPhoneNo(nonStaff.getPhoneNo());
        updateNonStaff.setEmailId(nonStaff.getEmailId());
        updateNonStaff.setAge(nonStaff.getAge());
        System.out.println(updateNonStaff);
        nonStaffRepository.save(updateNonStaff);
        return updateNonStaff;
    }

    public List<Object> getAllNonStaffList(){
        return nonStaffRepository.allNonStaffList();
    }

}
