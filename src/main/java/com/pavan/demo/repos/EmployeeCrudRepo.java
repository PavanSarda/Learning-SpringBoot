package com.pavan.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pavan.demo.entity.Employee;

public interface EmployeeCrudRepo extends JpaRepository<Employee, Long> {
	
	

}
