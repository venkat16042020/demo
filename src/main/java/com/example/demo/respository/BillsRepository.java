package com.example.demo.respository;

import com.example.demo.entity.BillsApsrtc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillsRepository extends JpaRepository<BillsApsrtc, String> {
}
