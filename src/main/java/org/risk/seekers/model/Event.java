package org.risk.seekers.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event implements Serializable {

	private static final long serialVersionUID = -4971021928344173988L;

	private String id;
	private String name;
	private String type;
	private Integer minimumAge;
	private Date startDate;
	private String testId;

}
