package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.EmployeeXMLBasedService;

@RestController
public class MessageProviderController {
	
	@Autowired
	private EmployeeXMLBasedService employeeXMLBasedService;
	
	public void setEmployeeXMLBasedService(EmployeeXMLBasedService employeeXMLBasedService) {
		this.employeeXMLBasedService = employeeXMLBasedService;
	}
	
	@GetMapping("/")
	public String hello() {
		return employeeXMLBasedService.getName();
	}

}
