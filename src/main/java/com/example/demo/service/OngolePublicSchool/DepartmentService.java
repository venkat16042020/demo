package com.example.demo.service.OngolePublicSchool;

import com.example.demo.entity.OngolePublicSchool.Department;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.OngolePublicSchool.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAllDepartmentData(){
        return departmentRepository.findAll();
    }

    public void addDepartment(Department department){
        System.out.println(department);
        departmentRepository.save(department);
    }

    public Department deleteDepartment(String departmentId){
        Department department = departmentRepository.findById(departmentId).orElseThrow(
                () -> new ResourceNotFoundException("department is not found with department Id: " + departmentId)
        );
        departmentRepository.delete(department);
        return department;
    }

    public Department getDepartment(String departmentId){
        return departmentRepository.findById(departmentId).orElseThrow(
                () -> new ResourceNotFoundException("department is not found with department Id: " + departmentId)
        );
    }

    public Department updateDepartment(String departmentId, Department department) {
        Department updateDepartment = departmentRepository.findById(departmentId).orElseThrow(
                () -> new ResourceNotFoundException("department is not found with department id: " + departmentId)
        );
        updateDepartment.setDepartmentId(department.getDepartmentId());
        updateDepartment.setEnglishDep(department.getEnglishDep());
        updateDepartment.setTeluguDep(department.getTeluguDep());
        updateDepartment.setHindiDep(department.getHindiDep());
        updateDepartment.setMathsDep(department.getMathsDep());
        updateDepartment.setScienceDep(department.getScienceDep());
        updateDepartment.setSocialDep(department.getSocialDep());
        System.out.println(updateDepartment);
        departmentRepository.save(updateDepartment);
        return updateDepartment;
    }

    public List<Object> getAllDepartmentList(){
        return departmentRepository.allDepartmentList();
    }

}
