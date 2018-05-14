package net.skhu.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

import lombok.Data;

@Data
@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	String userid;
	String password;
	String name;
	String email;
	boolean enabled;
	String userType;
	
	@ManyToOne
	@JoinColumn(name="departmentId")
	Department department;
}
