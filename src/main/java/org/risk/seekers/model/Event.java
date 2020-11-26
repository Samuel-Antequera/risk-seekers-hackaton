package org.risk.seekers.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class Event implements Serializable {

	private static final long serialVersionUID = -4971021928344173988L;

	private String id;
	private String name;
	private String type;
	private int minimumAge;
	private Date startDate;
	private String testId;

}
