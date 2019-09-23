package com.gorniak.spring.spring_boot_2h.dao;

import com.gorniak.spring.spring_boot_2h.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {

    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id,person);
    }

    List<Person> selectAllPeople();

    Optional<Person> sellectedPersonById(UUID id);

    int deletePerson(UUID id);

    int updatePersonById(UUID id, Person person);
}
