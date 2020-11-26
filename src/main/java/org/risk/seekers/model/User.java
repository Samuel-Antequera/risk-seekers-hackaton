package org.risk.seekers.model;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class User implements Serializable {

	private static final long serialVersionUID = 2287622954105560619L;

	private String id;
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	private String surname;
	
	@NotEmpty
	@Min(value = 6)
	@Max(value = 18)
	private int age;
	
	@NotEmpty
	private String mail;
	
	@NotEmpty
	private String phone;
	
	@NotEmpty
	private int score;

}
