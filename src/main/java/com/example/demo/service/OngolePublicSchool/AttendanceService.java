package com.example.demo.service.OngolePublicSchool;

import com.example.demo.entity.OngolePublicSchool.Attendance;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.OngolePublicSchool.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceService {
    @Autowired
    private AttendanceRepository attendanceRepository;

    public List<Attendance> getAllAttendanceData(){
        return attendanceRepository.findAll();
    }

    public void addAttendance(Attendance attendance){
        System.out.println(attendance);
        attendanceRepository.save(attendance);
    }

    public Attendance deleteAttendance(String attendanceId){
        Attendance attendance = attendanceRepository.findById(attendanceId).orElseThrow(
                () -> new ResourceNotFoundException("attendance is not found with attendance id: " + attendanceId)
        );
        attendanceRepository.delete(attendance);
        return attendance;
    }

    public Attendance getAttendanceByItemId(String attendanceId){
        return attendanceRepository.findById(attendanceId).orElseThrow(
                () -> new ResourceNotFoundException("attendance is not found with attendance id: " + attendanceId)
        );
    }

    public Attendance updateAttendance(String attendanceId, Attendance attendance) {
        Attendance updateAttendance = attendanceRepository.findById(attendanceId).orElseThrow(
                () -> new ResourceNotFoundException("attendance is not found with attendance id: " + attendanceId)
        );
        updateAttendance.setAttendanceId(attendance.getAttendanceId());
        updateAttendance.setStudents(attendance.getStudents());
        updateAttendance.setStaffs(attendance.getStaffs());
        updateAttendance.setNonStaffs(attendance.getNonStaffs());
        updateAttendance.setGender(attendance.getGender());
        updateAttendance.setDate(attendance.getDate());
        System.out.println(updateAttendance);
        attendanceRepository.save(updateAttendance);
        return updateAttendance;
    }

    public List<Object> getAllAttendanceList(){
        return attendanceRepository.allAttendanceList();
    }

}
