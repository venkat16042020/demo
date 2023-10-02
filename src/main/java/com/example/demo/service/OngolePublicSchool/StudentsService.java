package com.example.demo.service.OngolePublicSchool;

import com.example.demo.entity.OngolePublicSchool.Students;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.OngolePublicSchool.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {
    @Autowired
    private StudentsRepository studentsRepository;

    public List<Students> getAllStudentsData(){
        return studentsRepository.findAll();
    }

    public void addStudents(Students students){
        System.out.println(students);
        studentsRepository.save(students);
    }

    public Students deleteStudents(String studentsId){
        Students students = studentsRepository.findById(studentsId).orElseThrow(
                () -> new ResourceNotFoundException("students is not found with students id: " + studentsId)
        );
        studentsRepository.delete(students);
        return students;
    }

    public Students getStudentsByItemId(String studentsId){
        return studentsRepository.findById(studentsId).orElseThrow(
                () -> new ResourceNotFoundException("students is not found with students id: " + studentsId)
        );
    }

    public Students updateStudents(String studentsId, Students students) {
        Students updateStudents = studentsRepository.findById(studentsId).orElseThrow(
                () -> new ResourceNotFoundException("students is not found with students id: " + studentsId)
        );
        updateStudents.setStudentsId(students.getStudentsId());
        updateStudents.setFirstName(students.getFirstName());
        updateStudents.setLastName(students.getLastName());
        updateStudents.setGender(students.getGender());
        updateStudents.setAddress(students.getAddress());
        updateStudents.setPhoneNo(students.getPhoneNo());
        updateStudents.setAge(students.getAge());
        System.out.println(updateStudents);
        studentsRepository.save(updateStudents);
        return updateStudents;
    }

    public List<Object> getAllStudentsList(){
        return studentsRepository.allStudentsList();
    }

}
