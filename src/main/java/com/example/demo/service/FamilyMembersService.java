package com.example.demo.service;

import com.example.demo.entity.FamilyMembers;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.FamilyMembersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyMembersService {
    @Autowired
    private FamilyMembersRepository familyMembersRepository;

    public List<FamilyMembers> getAllFamilyMembersData() {return familyMembersRepository.findAll();}

    public void addFamilyMembers(FamilyMembers familyMembers){
        familyMembersRepository.save(familyMembers);
    }

    public FamilyMembers deletefamilyMembers(String familyMembersId){
        FamilyMembers familyMembers = familyMembersRepository.findById(familyMembersId).orElseThrow(
                () -> new ResourceNotFoundException("FamilyMembers is not found with id: " + familyMembersId)
        );
        familyMembersRepository.delete(familyMembers);
        return familyMembers;
    }

    public FamilyMembers getFamilyMembersById(String familyMembersId){
        return familyMembersRepository.findById(familyMembersId).orElseThrow(
                () -> new ResourceNotFoundException("FamilyMembers is not found with id: " + familyMembersId)
        );
    }

    public FamilyMembers updateFamilyMembers(String familyMembersId, FamilyMembers familyMembers) {
        FamilyMembers updateFamilyMembers = familyMembersRepository.findById(familyMembersId).orElseThrow(
                () -> new ResourceNotFoundException("familyMembers is not found with id: " + familyMembers)
        );
        updateFamilyMembers.setFamilyMembersId(familyMembers.getFamilyMembersId());
        updateFamilyMembers.setFather(familyMembers.getFather());
        updateFamilyMembers.setMother(familyMembers.getMother());
        updateFamilyMembers.setBrother(familyMembers.getBrother());
        updateFamilyMembers.setSister(familyMembers.getSister());
        updateFamilyMembers.setGrandFather(familyMembers.getGrandFather());
        updateFamilyMembers.setMother(familyMembers.getMother());
        updateFamilyMembers.setFirstName(familyMembers.getFirstName());
        updateFamilyMembers.setMiddleName(familyMembers.getMiddleName());
        updateFamilyMembers.setLastName(familyMembers.getLastName());
        updateFamilyMembers.setDob(familyMembers.getDob());
        familyMembersRepository.save(updateFamilyMembers);
        return updateFamilyMembers;
    }

}