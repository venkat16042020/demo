package com.example.demo.service;

import com.example.demo.entity.Person;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPersonsData(){
        return personRepository.findAll();
    }

    public void addPerson(Person person){
        personRepository.save(person);
    }

    public Person deletePerson(String personId){
        Person person = personRepository.findById(personId).orElseThrow(
                () -> new ResourceNotFoundException("Person is not found with id: " + personId)
        );
        personRepository.delete(person);
        return person;
    }

    public Person getPersonById(String personId){
        return personRepository.findById(personId).orElseThrow(
                () -> new ResourceNotFoundException("Person is not found with id: " + personId)
        );
    }

    public Person updatePerson(String personId, Person person) {
        Person updatePerson = personRepository.findById(personId).orElseThrow(
                () -> new ResourceNotFoundException("Person is not found with id: " + personId)
        );
        updatePerson.setPersonId(person.getPersonId());
        updatePerson.setPersonFirstName(person.getPersonFirstName());
        updatePerson.setPersonLastName(person.getPersonLastName());
        updatePerson.setPersonMiddleName(person.getPersonMiddleName());
        updatePerson.setCity(person.getCity());
        updatePerson.setStreet(person.getStreet());
        updatePerson.setDob(person.getDob());
        updatePerson.setCountry(person.getCountry());
        updatePerson.setState(person.getState());
        updatePerson.setZipcode(person.getZipcode());
        updatePerson.setLandMark(person.getLandMark());
        updatePerson.setTimezone(person.getTimezone());
        personRepository.save(updatePerson);
        return updatePerson;
    }

}
