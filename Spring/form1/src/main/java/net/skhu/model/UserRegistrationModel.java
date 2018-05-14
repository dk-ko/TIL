package net.skhu.model;

import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data; 
import net.skhu.domain.Department;
import net.skhu.domain.User;

@SuppressWarnings("deprecation")
@Data
public class UserRegistrationModel {
	@NotEmpty(message="학번을 입력하세요.") 
	@Size(min=3, max=12)
	String userid;
	
	@NotEmpty @Size(min=6, max=12, message="6 자리 이상 12 자리 이하이어야 합니다.")
	String passwd1;
	
	String passwd2;
	
	@NotEmpty @Size(min=2, max=30)
	String name;
	
	@Email
	String email;
	
	Integer departmentId;
	
	public User toUser() {
		User user = new User();
		user.setUserid(this.userid);
		user.setPassword(this.passwd1);
		user.setName(this.name);
		user.setEmail(this.email);
		user.setDepartment(new Department());
		user.getDepartment().setId(this.departmentId);
		return user;
	}
}
