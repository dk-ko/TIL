package net.skhu.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.skhu.domain.*;
import net.skhu.repository.*;

@RestController
@RequestMapping("api")
public class APIController {
	@Autowired DepartmentRepository departmentRepository;
	@Autowired StudentRepository studentRepository;
	@Autowired ProfessorRepository professorRepository;
	
	@RequestMapping("departments")
	public List<Department> departments(){
		return departmentRepository.findAll();
	}
	
	@RequestMapping("students")
	public List<Student> students(){
		return studentRepository.findAll();
	}
	
	@RequestMapping("department/{id}/students")
	public List<Student> departmentStudents(@PathVariable("id") int id){
		Optional<Department> result = departmentRepository.findById(id);
		Department department = result.orElse(new Department());
		return department.getStudents();
	}
	
	@RequestMapping("department/{id}/professors")
	public List<Professor> departmentProfessors(@PathVariable("id") int id) {
		Optional<Department> result = departmentRepository.findById(id);
		Department department = result.orElse(new Department());
		return department.getProfessors();
	}
	
	@RequestMapping("student/{id}/registrations")
	public List<Registration> studentRegistrations(@PathVariable("id") int id){
		Optional<Student> result = studentRepository.findById(id);
		Student student = result.orElse(new Student());
		return student.getRegistrations();
	}
	
	@RequestMapping("student/{id}/courses")
	public List<Course> studentCourses(@PathVariable("id") int id){
		Optional<Student> result = studentRepository.findById(id);
		Student student = result.orElse(new Student());
		List<Course> list = new ArrayList<Course>();
		for(Registration r : student.getRegistrations())
			list.add(r.getCourse());
		return list;
	}
	
	@RequestMapping("test/{n}")
	public List<Student> test(@PathVariable("n") int n){
		List<Student> list = null;
		switch(n) {
		case 1: list = studentRepository.findByName("고은"); break;
		case 2: list = studentRepository.findByNameStartsWith("김"); break;
		case 3: list = studentRepository.findByDepartmentName("국어국문학"); break;
		case 4: list = studentRepository.findByDepartmentNameStartsWith("국어"); break;
		case 5: list = studentRepository.findAllByOrderByName(); break;
		case 6: list = studentRepository.findAllByOrderByNameDesc(); break;
		case 7: list = studentRepository.findByDepartmentIdOrderByNameDesc(1); break;
		}
		return list;
	}
}
