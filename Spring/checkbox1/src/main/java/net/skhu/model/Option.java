package net.skhu.model;

import lombok.Data;

@Data
public class Option {
	String value;
	String label;
	
	public Option(String value, String label) {
		this.value = value;
		this.label = label;
	}
}
