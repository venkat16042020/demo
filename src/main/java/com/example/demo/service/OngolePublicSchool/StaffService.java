package com.example.demo.service.OngolePublicSchool;

import com.example.demo.entity.OngolePublicSchool.Staff;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.OngolePublicSchool.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {
    @Autowired
    private StaffRepository staffRepository;

    public List<Staff> getAllStaffData(){
        return staffRepository.findAll();
    }

    public void addStaff(Staff staff){
        System.out.println(staff);
        staffRepository.save(staff);
    }

    public Staff deleteStaff(String staffId){
        Staff staff = staffRepository.findById(staffId).orElseThrow(
                () -> new ResourceNotFoundException("staff is not found with staff id: " + staffId)
        );
        staffRepository.delete(staff);
        return staff;
    }

    public Staff getStaffByItemId(String staffId){
        return staffRepository.findById(staffId).orElseThrow(
                () -> new ResourceNotFoundException("staff is not found with staff id: " + staffId)
        );
    }

    public Staff updateStaff(String staffId, Staff staff) {
        Staff updateStaff = staffRepository.findById(staffId).orElseThrow(
                () -> new ResourceNotFoundException("staff is not found with staff id: " + staffId)
        );
        updateStaff.setStaffId(staff.getStaffId());
        updateStaff.setFirstName(staff.getFirstName());
        updateStaff.setLastName(staff.getLastName());
        updateStaff.setGender(staff.getGender());
        updateStaff.setAddress(staff.getAddress());
        updateStaff.setPhoneNo(staff.getPhoneNo());
        updateStaff.setEmailId(staff.getEmailId());
        updateStaff.setAge(staff.getAge());
        System.out.println(updateStaff);
        staffRepository.save(updateStaff);
        return updateStaff;
    }

    public List<Object> getAllStaffList(){
        return staffRepository.allStaffList();
    }

}
