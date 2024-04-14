package com.example.demo.respository.fromEmployee4;


import com.example.demo.entity.fromEmployee.OrderNew;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderNew,Long> {
}
