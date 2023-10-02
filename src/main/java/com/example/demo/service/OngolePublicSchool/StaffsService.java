package com.example.demo.service.OngolePublicSchool;

import com.example.demo.entity.OngolePublicSchool.Staffs;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.OngolePublicSchool.StaffsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffsService {
    @Autowired
    private StaffsRepository staffsRepository;

    public List<Staffs> getAllStaffsData(){
        return staffsRepository.findAll();
    }

    public void addStaffs(Staffs staffs){
        System.out.println(staffs);
        staffsRepository.save(staffs);
    }

    public Staffs deleteStaffs(String staffsId){
        Staffs staffs = staffsRepository.findById(staffsId).orElseThrow(
                () -> new ResourceNotFoundException("staffs is not found with staffs id: " + staffsId)
        );
        staffsRepository.delete(staffs);
        return staffs;
    }

    public Staffs getStaffsByItemId(String staffsId){
        return staffsRepository.findById(staffsId).orElseThrow(
                () -> new ResourceNotFoundException("staffs is not found with staffs id: " + staffsId)
        );
    }

    public Staffs updateStaffs(String staffsId, Staffs staffs) {
        Staffs updateStaffs = staffsRepository.findById(staffsId).orElseThrow(
                () -> new ResourceNotFoundException("staffs is not found with staffs id: " + staffsId)
        );
        updateStaffs.setStaffsId(staffs.getStaffsId());
        updateStaffs.setFirstName(staffs.getFirstName());
        updateStaffs.setLastName(staffs.getLastName());
        updateStaffs.setGender(staffs.getGender());
        updateStaffs.setAddress(staffs.getAddress());
        updateStaffs.setPhoneNo(staffs.getPhoneNo());
        updateStaffs.setEmailId(staffs.getEmailId());
        updateStaffs.setAge(staffs.getAge());
        System.out.println(updateStaffs);
        staffsRepository.save(updateStaffs);
        return updateStaffs;
    }

    public List<Object> getAllStaffsList(){
        return staffsRepository.allStaffsList();
    }

}
