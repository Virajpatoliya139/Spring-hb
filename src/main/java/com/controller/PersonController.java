package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.PersonEntity;
import com.Repository.PersonRepository;

@RestController
public class PersonController {

	@Autowired
	PersonRepository personRepo;
	
	@PostMapping("/addPerson")
	public PersonEntity addPerson (PersonEntity perEntity)
	{
		
		PersonRepository.save(perEntity);
		
	}
	
}
