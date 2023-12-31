package com.crudMvc.dao;

import java.util.List;

import com.crudMvc.model.Employee;

public interface EmployeeDao {

	public List<Employee> getAllEmployees();
    
	public void addEmployee(Employee employee);
 
    public void deleteEmployee(Integer employeeId);
 
    public Employee updateEmployee(Employee employee);
 
    public Employee getEmployee(int employeeid);
}
