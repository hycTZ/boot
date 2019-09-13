package com.core.db;

import com.core.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import javax.naming.Name;


@Component
public interface PersonRepository extends CrudRepository<Person, Name> {

}