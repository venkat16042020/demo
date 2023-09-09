package com.example.demo.respository;

import com.example.demo.entity.FamilyMembers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyMembersRepository extends JpaRepository<FamilyMembers, String> {
}
