package com.example.demo.respository.OngolePublicSchool;

import com.example.demo.entity.OngolePublicSchool.Cultural;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CulturalRepository extends JpaRepository<Cultural, String> {

    @Query(value = "select culturalId from cultural", nativeQuery = true)
    List<Object> allCulturalList();
}
