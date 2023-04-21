package com.controller;

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
import com.Repository.DepartmentRepository;

@RestController
public class DepartmentController {

	@Autowired
	DepartmentRepository DeptRepo;
	
	@PostMapping("/addDepartment")
	public DepartmentEntity addDepartment(@RequestBody DepartmentEntity DeptEntity)
	{
		DeptRepo.save(DeptEntity);
		return DeptEntity;
	}
	
	@GetMapping("/GetDepartmentById/{id}")
	public DepartmentEntity getDeptDataById(@PathVariable("id") Integer id)
	{
		Optional<DepartmentEntity> DeptEntity = DeptRepo.findById(id);
		if(DeptEntity.isEmpty()) {
			return null;
		}
		else {
			return DeptEntity.get();
		}
	}
	
	@DeleteMapping("/DeleteDeptById/{id}")
	public DepartmentEntity deleteDeptById(@PathVariable("id") Integer id)
	{
		DepartmentEntity DeptEntity = DeptRepo.findById(id).get();
		DeptRepo.deleteById(id);
		return DeptEntity;
	}
	
	@PutMapping("/updateDept")
	public DepartmentEntity update(@RequestBody DepartmentEntity DeptEntity)
	{
		DeptRepo.save(DeptEntity);
		return DeptEntity;
	}
}
