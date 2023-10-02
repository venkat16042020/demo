package com.example.demo.respository.OngolePublicSchool;

import com.example.demo.entity.OngolePublicSchool.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, String> {

    @Query(value = "select AttendanceId from Attendance", nativeQuery = true)
    List<Object> allAttendanceList();
}
