package com.anudip.hb.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Doctor {

	@Id
	private int id;
	@Column(length = 50,nullable = false)
	private String name;
	@Column(length = 50,nullable = false)
	private String address;
	@Column(length = 50,nullable = false,unique = true)
	private String phone;
	@Column(length = 50,nullable = false,unique = true)
	private String email;
	
	@OneToOne(targetEntity = Courses.class,cascade = CascadeType.ALL)
	private Courses courses;
}
