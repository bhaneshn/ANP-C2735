package com.anudip.hbce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
//import lombok.NotNull;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="customer_details")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(length=3)
	private int cid;
	
	@Column(length=30,nullable=false)
	@NotBlank(message="Customer name cannot be blank")
	@Min(value=3)
	private String cname;
	
	@Column(length=30,nullable=false,unique=true)
	@NotBlank(message="Customer email cannot be blank")
	@Email(message="Incorrect email")
	private String cemail;
	
	@Column(length=2,nullable=false)
	@javax.validation.constraints.NotBlank(message="Customer age cannot be blank")
	private int cage;
	
	@Column(length=20,nullable=false,unique=true)
	@NotNull(message="Customer phone cannot be blank")
	private long cphone;
}
