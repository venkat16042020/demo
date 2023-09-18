package com.example.demo.respository.restaurant;

import com.example.demo.entity.restaurant.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<Menu, String> {

    @Query(value = "select itemId from menu", nativeQuery = true)
    List<Object> allMenuItemsList();
}
