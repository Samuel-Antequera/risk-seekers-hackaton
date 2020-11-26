package org.risk.seekers.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USERS")
public class User implements Serializable {

	private static final long serialVersionUID = 2287622954105560619L;

	@Id
	@GeneratedValue
    @Column(name = "id")
	private String id;
	
	@NotEmpty
	@Column(name = "name")
	private String name;
	
	@NotEmpty
	@Column(name = "surname")
	private String surname;
	
	@Min(value = 6)
	@Max(value = 18)
	@Column(name = "age")
	private Integer age;
	
	@NotEmpty
	@Column(name = "mail")
	private String mail;
	
	@NotEmpty
	@Column(name = "score")
	private String phone;
	
	@NotEmpty
	@Column(name = "first_name")
	private Integer score;

}
