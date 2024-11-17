package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.employee;

public interface EmployeeRepo  extends CrudRepository<employee,Integer>{
	

}
