package com.project.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.project.employee_entity.Employee;
import com.project.service_layer.EmployeeService;

@WebMvcTest(EmployeeController.class)
class EmployeeControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private EmployeeService employeeService;

	@BeforeEach
	void setup() {
		new Employee("Rahul", "Kamble", "rahul@gmail.com", "java d");
	}

	@Test
 		public void testAddEmployee() throws Exception {
 			Employee employee = new Employee("Rahul","Kamble","rahul@gmail.com","java d");
 			Mockito.when(employeeService.createEmployee(employee)).thenReturn(employee);
 			mockMvc.perform(MockMvcRequestBuilders.post("/employees/")
 					.contentType(MediaType.APPLICATION_JSON)
 					.content("{\r\n" + 
 							"  \"first_name\": \"Rahul\",\r\n" + 
 							"  \"last_name\": \"Kamble\",\r\n" + 
 							"  \"email\": \"rahul@gmail.com\"\r\n" + 
 							"  \"designation\": \"java d\",\r\n" + 
 							"}"))
 					.andExpect(MockMvcResultMatchers.status().isOk());
 		}

}
