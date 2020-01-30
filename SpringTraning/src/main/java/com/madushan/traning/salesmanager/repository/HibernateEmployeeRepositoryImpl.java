package com.madushan.traning.salesmanager.repository;

import java.util.ArrayList;
import java.util.List;

import com.madushan.training.salesmanager.model.Employee;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		
		Employee employee = new Employee();
		employee.setEmployeeName("Madushan");
		employee.setEmployeeLocation("Klaniya");
		employees.add(employee);
		return employees;
		
	}

}
