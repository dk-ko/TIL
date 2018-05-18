package net.skhu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping({"/", "home/page1"})
	public String page1() {
		System.out.println("page1");
		return "home/page1";
	}
	
	@RequestMapping("home/page2")
	public String page2() {
		return "home/page2";
	}
	
	@RequestMapping("home/page3")
	public String page3() {
		return "home/page3";
	}

}
