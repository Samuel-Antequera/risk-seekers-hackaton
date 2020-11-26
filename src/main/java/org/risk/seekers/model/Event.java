package org.risk.seekers.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Event implements Serializable {

	private static final long serialVersionUID = -4971021928344173988L;

	private String id;
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	private String type;
	
	@NotEmpty
	private Integer minimumAge;
	
	@NotEmpty
	private Date startDate;
	
	@NotEmpty
	private String testId;

}
