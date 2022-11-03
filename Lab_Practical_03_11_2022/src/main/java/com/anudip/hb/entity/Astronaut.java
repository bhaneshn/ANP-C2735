package com.anudip.hb.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;



@Data
@Entity
@Table(name="Astronaut_details")
public class Astronaut {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(length=3)
	private int Id;
	
	@Column(length=20,nullable = false)
	@NotBlank(message=" Name Cannot be blank")
	@Min(value=3)
	private String aName;
	
	@Column(length = 50,nullable = false)
	@NotBlank(message=" Mission Name Cannot be blank")
	@NotNull(message = "cannot blank")
	private String aMission;
	
	@Column(length=20,nullable = false)
	@NotBlank(message="Phone Number Cannot be blank")
	private long aPhone;
	
	@Column(length = 50)
	@NotBlank(message="RocketName Cannot be blank")
	private String aRocketName;
	
}
