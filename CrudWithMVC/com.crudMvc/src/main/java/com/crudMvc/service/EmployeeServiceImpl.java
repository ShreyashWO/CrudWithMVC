package com.crudMvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudMvc.dao.EmployeeDao;
import com.crudMvc.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	private EmployeeDao employeeDAO;
	
	
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeDAO.getAllEmployees();
	}
	@Transactional
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDAO.addEmployee(employee);
	}
 
	@Transactional
	public void deleteEmployee(Integer employeeId) {
		// TODO Auto-generated method stub
		employeeDAO.deleteEmployee(employeeId);
	}

	@Transactional
	public Employee getEmployee(int employeeid) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployee(employeeid);
	}

	@Transactional
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.updateEmployee(employee);
	}

	
}
