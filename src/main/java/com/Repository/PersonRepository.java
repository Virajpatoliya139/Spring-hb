package com.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Entity.PersonEntity;

@Repository
public interface PersonRepository extends CrudRepository<PersonEntity, Integer> {

}
