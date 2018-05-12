package net.skhu.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.skhu.domain.*;
import net.skhu.repository.*;

@RestController
@RequestMapping("api")
public class APIController {
	@Autowired StudentRepository studentRepository;
	@Autowired JpaContext jpaContext;
	
	@RequestMapping("jpql")
	public Object jpql(@RequestParam("s") String s) {
		EntityManager manager = jpaContext.getEntityManagerByManagedType(Student.class);
		Query query = manager.createQuery(s);
		Object r = query.getResultList();
		return r;
	}
	
	@RequestMapping("testFind/{n}")
	public Object testFind(@PathVariable("n") int n) {
		List list = null;
		switch(n) {
		case 1: list = studentRepository.find1(); break;
		case 2: list = studentRepository.find2(1); break;
		case 3: list = studentRepository.find3("200032010", "고은"); break;
		case 4: list = studentRepository.find4("200032010", "고은"); break;
		case 5: list = studentRepository.find5(); break;
		case 6: list = studentRepository.find6(); break;
		case 7: list = studentRepository.find7("200032010"); break;
		case 8: list = studentRepository.find8(); break;
		case 9: list = studentRepository.find9(); break;
		}
		return list;
	}
	
	@Transactional
	@RequestMapping("testUpdate/{n}")
	public Object testUpdate(@PathVariable("n") int n) {
		String newName = (n==0) ? "Go Eun" : "고은" ;
		studentRepository.updateName(1, newName);
		Optional<Student> result = studentRepository.findById(1);
		Student student = result.orElse(new Student());
		return student;
	}
}
