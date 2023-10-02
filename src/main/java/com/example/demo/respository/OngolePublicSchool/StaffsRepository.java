package com.example.demo.respository.OngolePublicSchool;

import com.example.demo.entity.OngolePublicSchool.Staffs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffsRepository extends JpaRepository<Staffs, String> {

    @Query(value = "select StaffsId from Staffs", nativeQuery = true)
    List<Object> allStaffsList();
}
