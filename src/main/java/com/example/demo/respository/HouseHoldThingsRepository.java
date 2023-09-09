package com.example.demo.respository;

import com.example.demo.entity.HouseHoldThings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseHoldThingsRepository extends JpaRepository<HouseHoldThings, String> {
}
