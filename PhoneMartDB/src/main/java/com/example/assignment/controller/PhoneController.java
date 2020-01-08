package com.example.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.assignment.dao.DataInterface;
import com.example.assignment.model.Phone;

@RestController
public class PhoneController
{
	
	@Autowired
	DataInterface dataInterface;
	
	@PostMapping(value="/savePhones")
	public String saveUser(@RequestBody List<Phone> phones)
	{
		
		System.out.println("Phones-----------------"+phones);
		dataInterface.saveAll(phones);
		return phones.size() + "  record saved in Derby Database ";
		
	}
	
	@GetMapping(value="/getAll")
	public List<Phone> getAllPhone()
	{
		return dataInterface.findAll();
		
	}
}
