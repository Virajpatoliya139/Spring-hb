package com.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Entity.EmployeeEntity;


@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer>{

}
