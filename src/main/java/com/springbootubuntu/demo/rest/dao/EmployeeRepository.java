package com.springbootubuntu.demo.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootubuntu.demo.rest.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
