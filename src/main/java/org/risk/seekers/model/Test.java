package org.risk.seekers.model;

import java.io.Serializable;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Test implements Serializable {

	private static final long serialVersionUID = -860767149376516444L;

	private String id;
	private String testCategory;
	private Map<Integer, String> questions;
	private Map<Integer, String> responses;

}
