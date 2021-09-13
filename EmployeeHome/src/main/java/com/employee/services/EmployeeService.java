package com.employee.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.employee.model.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeById(long id);
	
//	public Employee updateEmployee(long id);
	
	public void deleteEmployee(long id);

	public ResponseEntity<Object> updateEmployee(Employee employee, long id);
}
