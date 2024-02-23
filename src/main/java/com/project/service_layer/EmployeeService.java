package com.project.service_layer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.project.employee_entity.Employee;
import com.project.repository_interface.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	public  Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public List<Employee> createEmployee(List<Employee> employee) {
		return employeeRepository.saveAll(employee);
	}

	public Employee getEmployeById(int id) {
		return employeeRepository.findById(id).orElseThrow(()-> new ResponseStatusException(
				  HttpStatus.NOT_FOUND, "employee not found"
				));
	}

	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

	public Employee updateEmployee(int id, Employee employee) {
		Employee oldEmployee = null;
		Optional<Employee> optionalEmployee = employeeRepository.findById(id);
		if (optionalEmployee.isPresent()) {
			oldEmployee = optionalEmployee.get();
			oldEmployee.setFirst_name(employee.getFirst_name());
			oldEmployee.setLast_name(employee.getLast_name());
			oldEmployee.setEmail(employee.getEmail());
			oldEmployee.setDesignation(employee.getDesignation());
			employeeRepository.save(oldEmployee);
		} else {
			throw new ResponseStatusException(
				HttpStatus.NOT_FOUND, "employee not found"
			);
		}
		return oldEmployee;
	}

	public String deleteEmployeeById(int id) {
		employeeRepository.deleteById(id);
		return " Employee Got Deleted  ";
	}

}
