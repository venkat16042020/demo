package com.example.demo.respository.OngolePublicSchool;

import com.example.demo.entity.OngolePublicSchool.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsRepository extends JpaRepository<Students, String> {

    @Query(value = "select StudentsId from Students", nativeQuery = true)
    List<Object> allStudentsList();
}
