package com.mausamrayamajhi.liquibase.repository;

import com.mausamrayamajhi.liquibase.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface PersonRepository extends JpaRepository<Person,Long> {
    Person findByName(String name);
}
