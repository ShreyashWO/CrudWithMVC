package com.crudMvc.dao;


import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.crudMvc.model.Employee;


@EnableTransactionManagement
@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
    private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return  sessionFactory.getCurrentSession().createQuery("from Employee").list();
	}

	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(employee);
	}

	public void deleteEmployee(Integer employeeId) {
		// TODO Auto-generated method stub
        Employee employee = (Employee) sessionFactory.getCurrentSession().load(Employee.class, employeeId);
        if (null != employee) {
            this.sessionFactory.getCurrentSession().delete(employee);
        }
	}

	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
        sessionFactory.getCurrentSession().update(employee);
        return employee;
	}

	public Employee getEmployee(int employeeid) {
		// TODO Auto-generated method stub
        return (Employee) sessionFactory.getCurrentSession().get(Employee.class, employeeid);
	}


}
