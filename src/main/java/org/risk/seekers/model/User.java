package org.risk.seekers.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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

	@Column(name = "name")
	private String name;
	
	@Column(name = "surname")
	private String surname;
	
	@Column(name = "age")
	private Integer age;
	
	@Column(name = "mail")
	private String mail;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "score")
	private Integer score;

}
