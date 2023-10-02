package com.example.demo.service.OngolePublicSchool;

import com.example.demo.entity.OngolePublicSchool.Admin;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.OngolePublicSchool.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public List<Admin> getAllAdminData(){
        return adminRepository.findAll();
    }

    public void addAdmin(Admin admin){
        System.out.println(admin);
        adminRepository.save(admin);
    }

    public Admin deleteAdmin(String adminId){
        Admin admin = adminRepository.findById(adminId).orElseThrow(
                () -> new ResourceNotFoundException("admin is not found with admin Id: " + adminId)
        );
        adminRepository.delete(admin);
        return admin;
    }

    public Admin getAdmin(String adminId){
        return adminRepository.findById(adminId).orElseThrow(
                () -> new ResourceNotFoundException("admin is not found with admin Id: " + adminId)
        );
    }

    public Admin updateAdmin(String adminId, Admin admin) {
        Admin updateAdmin = adminRepository.findById(adminId).orElseThrow(
                () -> new ResourceNotFoundException("admin is not found with admin id: " + adminId)
        );
        updateAdmin.setAdminId(admin.getAdminId());
        updateAdmin.setStudentsId(admin.getStudentsId());
        updateAdmin.setStaffsId(admin.getStaffsId());
        updateAdmin.setNonStaffsId(admin.getNonStaffsId());
        updateAdmin.setGames(admin.getGames());
        updateAdmin.setVehicles(admin.getVehicles());
        updateAdmin.setInfrastructure(admin.getInfrastructure());
        updateAdmin.setMedia(admin.getMedia());
        updateAdmin.setAttendance(admin.getAttendance());
        updateAdmin.setSalaries(admin.getSalaries());
        System.out.println(updateAdmin);
        adminRepository.save(updateAdmin);
        return updateAdmin;
    }

    public List<Object> getAllAdminList(){
        return adminRepository.allAdminList();
    }

}
