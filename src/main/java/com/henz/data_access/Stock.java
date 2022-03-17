package com.henz.data_access;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

/*
 * 
 * DB entity
 * */

@Entity //make a DB entity
@Data
@Table(name="stocks")
public class Stock implements Serializable{
	
	@Id
	private String id;
	 
	private String name;
	
	@NotNull
	@DecimalMin("0.01")
	private Double price;
}
