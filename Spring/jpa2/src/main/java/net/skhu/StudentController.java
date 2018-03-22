package net.skhu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("student")
public class StudentController {

	@Autowired StudentRepository studentRepository;
	@Autowired DepartmentRepository departmentRepository;

	@RequestMapping("list")
	public String list(Model model) {
		model.addAttribute("list", studentRepository.findAll());
		return "student/list";
	}

	@RequestMapping(value="edit", method=RequestMethod.GET)
	public String edit(@RequestParam("id") int id, Model model) {
		model.addAttribute("departments", departmentRepository.findAll());
		model.addAttribute("student", studentRepository.findById(id));
		return "student/edit";
	}

	@RequestMapping(value="edit", method=RequestMethod.POST)
	public String edit(Student student, Model model) {
		studentRepository.save(student);
		model.addAttribute("departments", departmentRepository.findAll());
		model.addAttribute("message", "저장했습니다.");
		return "student/edit";
	}
}