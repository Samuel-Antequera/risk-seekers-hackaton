package org.risk.seekers.model;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Test implements Serializable {

	private static final long serialVersionUID = -860767149376516444L;

	private String id;
	@NotEmpty
	private String testCategory;
	
	@NotEmpty
	private Map<Integer, String> questions;
	
	@NotEmpty
	private Map<Integer, String> responses;

}
