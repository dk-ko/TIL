package net.skhu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("student2")
public class Student2Controller {

	Student student = new Student(1, "201543023","QEW","oew@skhu.ac.kr");

	@RequestMapping(value="edit", method=RequestMethod.GET)
	public String edit(Model model) {
		model.addAttribute("student", student);
		return "student2/edit";
	}

	@RequestMapping(value="edit", method=RequestMethod.POST)
	public String edit(Student student, Model model) {
		this.student = student;
		model.addAttribute("message", "저장했습니다");
		return "student2/edit";
	}
}
