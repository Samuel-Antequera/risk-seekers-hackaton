package org.risk.seekers.model;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class Result implements Serializable {

	private static final long serialVersionUID = 5035059695663597921L;

	private String id;
	
	@NotEmpty
	private int result;

}
