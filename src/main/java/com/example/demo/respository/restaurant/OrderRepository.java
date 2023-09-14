package com.example.demo.respository.restaurant;

import com.example.demo.entity.restaurant.Order9;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order9, String> {
}
