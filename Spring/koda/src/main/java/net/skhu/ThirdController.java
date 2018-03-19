package net.skhu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/third")
public class ThirdController {
	@RequestMapping("test")
	public String test1(Model model) {
		System.out.print("test");
		Student student = new Student(20,"2000","koda","koda@mail.com");
		model.addAttribute("student", student);
		return "third/test";
	}
}
