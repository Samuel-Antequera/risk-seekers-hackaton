package org.risk.seekers.model;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

	private static final long serialVersionUID = 2287622954105560619L;

	private String id;
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	private String surname;
	
	@Min(value = 6)
	@Max(value = 18)
	private Integer age;
	
	@NotEmpty
	private String mail;
	
	@NotEmpty
	private String phone;
	
	private Integer score;

}
