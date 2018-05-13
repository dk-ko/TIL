package net.skhu.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.skhu.domain.User;
import net.skhu.model.UserRegistrationModel;
import net.skhu.repository.DepartmentRepository;
import net.skhu.repository.UserRepository;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired DepartmentRepository departmentRepository;
	@Autowired UserRepository userRepository;

	@RequestMapping(value="register", method=RequestMethod.GET)
	public String register(UserRegistrationModel user, Model model) {
		model.addAttribute("departments", departmentRepository.findAll());
		return "user/register";
	}

	@RequestMapping(value="register", method=RequestMethod.POST)
	public String register(@Valid UserRegistrationModel userModel, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("departments", departmentRepository.findAll());
			return "user/register";
		}
		User user = userModel.toUser();
		user.setEnabled(true);
		user.setUserType("학생");
		userRepository.save(user);
		return "redirect:success";
	}

	@RequestMapping("success")
	public String success() {
		return "user/success";
	}
}