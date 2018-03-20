package net.skhu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student1")
public class Student1Controller {
	static final Student[] list = new Student[] {
			new Student(1, "201532045", "홍길동", "hgd@skhu.ac.kr"),
			new Student(2, "201532324", "전우치", "jwc@skhu.ac.kr"),
			new Student(3, "201532345", "임꺽정", "ikj@skhu.ac.kr")
	};

	@RequestMapping("list")
	public String list(Model model) {
		model.addAttribute("list", list);
		return "student1/list";
	}

}
