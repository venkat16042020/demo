package com.example.demo.respository.restaurant;

import com.example.demo.entity.restaurant.Rent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentRepository extends JpaRepository<Rent, String> {

    @Query(value = "select rentId from rent", nativeQuery = true)
    List<Object> allRentList();
}
