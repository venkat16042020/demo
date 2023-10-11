package com.example.demo.respository.OngolePublicSchool;

import com.example.demo.entity.OngolePublicSchool.Salaries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalariesRepository extends JpaRepository<Salaries, String> {

    @Query(value = "select salariesId from salaries", nativeQuery = true)
    List<Object> allSalariesList();
}
