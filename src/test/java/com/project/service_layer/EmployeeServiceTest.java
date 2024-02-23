package com.project.service_layer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.project.employee_entity.Employee;
import com.project.repository_interface.EmployeeRepository;

@SpringBootTest
class EmployeeServiceTest {

	@Autowired
	private EmployeeService employeeService;

	@MockBean
	private EmployeeRepository employeeRepository;

	@BeforeEach
	void setup() {
	Optional<Employee> employee = Optional.of(new Employee("Rahul", "Kamble", "rahul@gmail.com", "java d"));
	Mockito.when(employeeRepository.findById(1)).thenReturn(employee);
	
	}
	@Test
	public void testGetEmployeeById() {
		String first_name = "Rahul";
		Employee employeeById = employeeService.getEmployeById(1);
		assertEquals(first_name, employeeById.getFirst_name());
	}

}
