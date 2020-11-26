package org.risk.seekers.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class Event implements Serializable {

	private static final long serialVersionUID = -4971021928344173988L;

	private String id;
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	private String type;
	
	@NotEmpty
	private int minimumAge;
	
	@NotEmpty
	private Date startDate;
	
	@NotEmpty
	private String testId;

}
