package com.controller;

import java.beans.Transient;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.DepartmentEntity;
import com.Entity.EmployeeEntity;
import com.Repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepo;
	
	@PostMapping("/AddEmployee")
	public EmployeeEntity addEmployee(@RequestBody EmployeeEntity employeeEntity)
	{
		employeeRepo.save(employeeEntity);
		return employeeEntity;
	}
	
	@GetMapping("/getEmployeeById/{id}")
	public EmployeeEntity getEmployeeById(@PathVariable("id") Integer id)
	{
		Optional<EmployeeEntity> employeeOptional = employeeRepo.findById(id);
		
		if(employeeOptional.isEmpty()) {
			return null;
		}
		else {
			return employeeOptional.get();
		}
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public EmployeeEntity deleteEmployee(@PathVariable("id") Integer id)
	{
		EmployeeEntity employeeEntity=employeeRepo.findById(id).get();
		employeeRepo.deleteById(id);
		return employeeEntity;
	}
	
	@PutMapping("/updateEmployee")
	public EmployeeEntity updateEmployee (@RequestBody EmployeeEntity employeeEntity)
	{
		employeeRepo.save(employeeEntity);
		return employeeEntity;
	}
}
