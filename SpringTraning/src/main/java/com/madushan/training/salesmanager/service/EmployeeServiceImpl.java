package com.madushan.training.salesmanager.service;

import java.util.List;

import com.madushan.training.salesmanager.model.Employee;
import com.madushan.traning.salesmanager.repository.EmployeeRepository;
import com.madushan.traning.salesmanager.repository.HibernateEmployeeRepositoryImpl;


public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeRepository employeeRepository = new HibernateEmployeeRepositoryImpl();
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}
	

}
