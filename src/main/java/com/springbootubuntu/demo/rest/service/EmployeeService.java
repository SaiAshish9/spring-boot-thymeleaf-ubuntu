package com.springbootubuntu.demo.rest.service;

import java.util.List;

import com.springbootubuntu.demo.rest.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
