package com.project.repository_interface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.employee_entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
