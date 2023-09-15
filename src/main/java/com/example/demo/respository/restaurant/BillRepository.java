package com.example.demo.respository.restaurant;

import com.example.demo.entity.restaurant.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends JpaRepository<Bill, String> {
}
