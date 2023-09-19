package com.example.demo.respository.restaurant;

import com.example.demo.entity.restaurant.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockRepository extends JpaRepository<Stock, String> {

    @Query(value = "select stockId from Stock", nativeQuery = true)
    List<Object> allStockList();
}
