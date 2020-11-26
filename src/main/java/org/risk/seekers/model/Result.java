package org.risk.seekers.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Result implements Serializable {

	private static final long serialVersionUID = 5035059695663597921L;

	private String id;
	
	@NotEmpty
	private Integer result;

}
