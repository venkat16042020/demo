package com.example.demo.respository;

import com.example.demo.entity.Relatives;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelativesRepository extends JpaRepository<Relatives, String> {
}
