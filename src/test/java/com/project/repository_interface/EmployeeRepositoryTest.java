package com.project.repository_interface;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.project.employee_entity.Employee;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class EmployeeRepositoryTest {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private TestEntityManager entityManager;
	Employee employee;

	@BeforeEach
	void setup() {
		employee = new Employee("Rahul","Kamble","rahul@gmail.com","java d");
		entityManager.persist(employee);

	}

	@Test
	public void testFindById() {
		Employee test = employeeRepository.findById(employee.getId()).get();
		assertEquals("Rahul", test.getFirst_name());
	}

}
