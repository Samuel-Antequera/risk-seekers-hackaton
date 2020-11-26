package org.risk.seekers.model;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class Product implements Serializable {

	private static final long serialVersionUID = -4924982350014423150L;

	private String id;
	private String name;
	private ProductType productType;
	private Boolean risk;
	private BigDecimal productCost;
	private int minimumScore;

}
