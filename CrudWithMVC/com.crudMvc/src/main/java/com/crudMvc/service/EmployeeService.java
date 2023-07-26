package com.crudMvc.service;

import java.util.List;

import com.crudMvc.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();
	
	public void addEmployee(Employee employee);

	public void deleteEmployee(Integer employeeId);

	public Employee getEmployee(int employeeid);

	public Employee updateEmployee(Employee employee); 	 	
}
