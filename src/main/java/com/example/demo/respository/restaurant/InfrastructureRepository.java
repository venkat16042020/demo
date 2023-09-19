package com.example.demo.respository.restaurant;

import com.example.demo.entity.restaurant.Infrastructure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InfrastructureRepository extends JpaRepository<Infrastructure, String> {

    @Query(value = "select itemId from Infrastructure", nativeQuery = true)
    List<Object> allInfrastructureItemsList();
}
