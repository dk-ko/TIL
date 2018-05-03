package net.skhu.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.skhu.domain.Department;
import net.skhu.domain.Employee;
import net.skhu.repository.DepartmentRepository;
import net.skhu.repository.EmployeeRepository;;

@RestController
@RequestMapping("api")
public class APIController {
	@Autowired DepartmentRepository departmentRepository;
	@Autowired EmployeeRepository employeeRepository;
	
	@RequestMapping("employees")
	public List<Employee> employees(){
		return employeeRepository.findAll();
	}
	
	@RequestMapping("employees/{id}")
	public Optional<Employee> student(@PathVariable("id") int id) {
		return employeeRepository.findById(id);
	}
	
	@RequestMapping("departments")
	public List<Department> departments(){
		return departmentRepository.findAll();
	}
}
