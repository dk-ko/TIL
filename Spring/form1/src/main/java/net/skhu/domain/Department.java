package net.skhu.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Data;

@Data
@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="departmentName")
	String name;
}
