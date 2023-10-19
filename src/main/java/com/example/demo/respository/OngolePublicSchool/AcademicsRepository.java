package com.example.demo.respository.OngolePublicSchool;

import com.example.demo.entity.OngolePublicSchool.Academics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AcademicsRepository extends JpaRepository<Academics, String> {

    @Query(value = "select academicsId from academics", nativeQuery = true)
    List<Object> allAcademicsList();
}
