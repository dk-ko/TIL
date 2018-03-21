package net.skhu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")
public class StudentController {

	@Autowired StudentRepository studentRepository;

	@RequestMapping("list")
	public String list(Model model) {
		List<Student> list = studentRepository.findAll();
		model.addAttribute("list",list);
		return "student/list";
	}
}
