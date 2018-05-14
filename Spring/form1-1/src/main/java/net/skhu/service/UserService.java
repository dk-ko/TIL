package net.skhu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import net.skhu.domain.User;
import net.skhu.model.UserRegistrationModel;
import net.skhu.repository.UserRepository;

@Service
public class UserService {
	@Autowired UserRepository userRepository;
	
	public boolean hasErrors(UserRegistrationModel userModel, BindingResult bindingResult) {
		if(bindingResult.hasErrors())
			return true;
		if (userModel.getPasswd1().equals(userModel.getPasswd2())==false) {
			bindingResult.rejectValue("passwd1", null,"비밀번호가 일치하지 않습니다.");
			return true;
		}
		User user = userRepository.findByUserid(userModel.getUserid());
		if(user != null) {
			bindingResult.rejectValue("userid", null, "사용자 아이디가 중복됩니다.");
			return true;
		}
		return false;
	}
	
	public void save(UserRegistrationModel userModel) {
		User user = userModel.toUser();
		user.setEnabled(true);
		user.setUserType("학생");
		userRepository.save(user);
	}
}
