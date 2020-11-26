package org.risk.seekers.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable {

	private static final long serialVersionUID = 2287622954105560619L;

	private String id;
	private String name;
	private String surname;
	private int age;
	private String mail;
	private String phone;
	private int score;

}
