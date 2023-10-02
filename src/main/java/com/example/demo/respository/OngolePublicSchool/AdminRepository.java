package com.example.demo.respository.OngolePublicSchool;

import com.example.demo.entity.OngolePublicSchool.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {

    @Query(value = "select adminId from admin", nativeQuery = true)
    List<Object> allAdminList();
}
