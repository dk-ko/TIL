package net.skhu.controller;

import java.util.Optional;

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
	
	private boolean isValid(UserRegistrationModel userModel, BindingResult bindingResult) {
		if(userModel.getPasswd1().equals(userModel.getPasswd2()) == false) {
			bindingResult.rejectValue("password2", null, "비밀번호가 일치하지 않습니다.");
			return false;
		}
		/*
		Optional<User> result = userRepository.findById(Integer.parseInt(userModel.getUserid()));
		if(!result.isPresent()) {
			bindingResult.rejectValue("userid", null,"사용자 아이디가 중복됩니다.");
			return false;
		}
		*/
		User user = userRepository.findByUserid(userModel.getUserid());
		if(user != null) {
			bindingResult.rejectValue("userid", null, "사용자 아이디가 중복됩니다.");
			return false;
		}
		return true;
	}

	@RequestMapping(value="register", method=RequestMethod.POST)
	public String register(@Valid UserRegistrationModel userModel, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors() || isValid(userModel, bindingResult)==false) {
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