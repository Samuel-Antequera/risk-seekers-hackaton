package org.risk.seekers.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product implements Serializable {

	private static final long serialVersionUID = -4924982350014423150L;

	private String id;
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	private ProductType productType;
	
	@NotEmpty
	private Boolean risk;
	
	@NotEmpty
	private BigDecimal productCost;
	
	@NotEmpty
	private int minimumScore;

}
