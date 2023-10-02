package com.example.demo.service.OngolePublicSchool;

import com.example.demo.entity.OngolePublicSchool.NonStaffs;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.OngolePublicSchool.NonStaffsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NonStaffsService {
    @Autowired
    private NonStaffsRepository nonStaffsRepository;

    public List<NonStaffs> getAllNonStaffsData(){
        return nonStaffsRepository.findAll();
    }

    public void addNonStaffs(NonStaffs nonStaffs){
        System.out.println(nonStaffs);
        nonStaffsRepository.save(nonStaffs);
    }

    public NonStaffs deleteNonStaffs(String nonStaffsId){
        NonStaffs nonStaffs = nonStaffsRepository.findById(nonStaffsId).orElseThrow(
                () -> new ResourceNotFoundException("nonStaffs is not found with nonStaffs id: " + nonStaffsId)
        );
        nonStaffsRepository.delete(nonStaffs);
        return nonStaffs;
    }

    public NonStaffs getNonStaffsByItemId(String nonStaffsId){
        return nonStaffsRepository.findById(nonStaffsId).orElseThrow(
                () -> new ResourceNotFoundException("nonStaffs is not found with nonStaffs id: " + nonStaffsId)
        );
    }

    public NonStaffs updateNonStaffs(String nonStaffsId, NonStaffs nonStaffs) {
        NonStaffs updateNonStaffs = nonStaffsRepository.findById(nonStaffsId).orElseThrow(
                () -> new ResourceNotFoundException("nonStaffs is not found with nonStaffs id: " + nonStaffsId)
        );
        updateNonStaffs.setNonStaffsId(nonStaffs.getNonStaffsId());
        updateNonStaffs.setFirstName(nonStaffs.getFirstName());
        updateNonStaffs.setLastName(nonStaffs.getLastName());
        updateNonStaffs.setGender(nonStaffs.getGender());
        updateNonStaffs.setAddress(nonStaffs.getAddress());
        updateNonStaffs.setPhoneNo(nonStaffs.getPhoneNo());
        updateNonStaffs.setEmailId(nonStaffs.getEmailId());
        updateNonStaffs.setAge(nonStaffs.getAge());
        System.out.println(updateNonStaffs);
        nonStaffsRepository.save(updateNonStaffs);
        return updateNonStaffs;
    }

    public List<Object> getAllNonStaffsList(){
        return nonStaffsRepository.allNonStaffsList();
    }

}
