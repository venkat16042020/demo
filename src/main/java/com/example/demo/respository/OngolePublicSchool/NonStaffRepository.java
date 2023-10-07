package com.example.demo.respository.OngolePublicSchool;

import com.example.demo.entity.OngolePublicSchool.NonStaff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NonStaffRepository extends JpaRepository<NonStaff, String> {

    @Query(value = "select NonStaffId from NonStaffs", nativeQuery = true)
    List<Object> allNonStaffList();
}
