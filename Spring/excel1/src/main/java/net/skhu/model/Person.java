package net.skhu.model;

import java.util.Date;

import lombok.Data;

@Data
public class Person {
	int id;
	String name;
	Date birthDate;
	Double score;
	boolean enabled;
	
	public Person(int id, String name, Date birthDate, Double score, boolean enabled) {
		this.id=id;
		this.name=name;
		this.birthDate=birthDate;
		this.score=score;
		this.enabled=enabled;
	}
}
