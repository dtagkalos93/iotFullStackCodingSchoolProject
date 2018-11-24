package com.codingschool.redIotProject.Repositories;

import com.codingschool.redIotProject.Entities.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource
public interface PersonRepository extends CrudRepository<Person,Long> {
}
