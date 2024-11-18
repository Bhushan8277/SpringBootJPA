package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.entities.employee;
import com.example.demo.repository.EmployeeRepo;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=(AnnotationConfigApplicationContext) SpringApplication.run(SpringBootJpaApplication.class, args);
		EmployeeRepo er=ac.getBean(EmployeeRepo.class);
		
		employee emp=new employee();
		emp.setName("Ram");
		emp.setAddress("bangalore");
		emp.setPhone(914867987);
		
		employee empl=er.findById(5).get();
		System.out.print(empl);
		empl.setName("Bhushan");
		empl.setAddress("mangalore");
		empl.setPhone(81012483);
		er.save(empl);
		
	}

}
