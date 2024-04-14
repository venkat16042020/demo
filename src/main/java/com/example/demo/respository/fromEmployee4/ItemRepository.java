package com.example.demo.respository.fromEmployee4;

import com.example.demo.entity.fromEmployee.ItemNew;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<ItemNew,Long> {

}
