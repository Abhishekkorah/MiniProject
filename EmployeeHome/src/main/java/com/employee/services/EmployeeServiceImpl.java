package com.employee.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	public Employee getEmployeeById(long id) {
		// TODO Auto-generated method stub
		return employeeRepository.getByEmployeeId(id);
	}

	public ResponseEntity<Object> updateEmployee(Employee employee ,long id) {
		// TODO Auto-generated method stub
		
		Optional<Employee> updateemployee = Optional.of(employeeRepository.findById(id).get());
		
		if(!(updateemployee.isPresent())) {
			System.out.println("inside if");
			return ResponseEntity.notFound().build();
		}
		employee.setEmployeeId(id);
		
		employeeRepository.save(employee);
		
		return ResponseEntity.noContent().build();
	}

	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub
		
		employeeRepository.deleteById(id);
		
	}

}
