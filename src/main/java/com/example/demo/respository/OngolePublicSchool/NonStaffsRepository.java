package com.example.demo.respository.OngolePublicSchool;

import com.example.demo.entity.OngolePublicSchool.NonStaffs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NonStaffsRepository extends JpaRepository<NonStaffs, String> {

    @Query(value = "select NonStaffsId from NonStaffs", nativeQuery = true)
    List<Object> allNonStaffsList();
}
