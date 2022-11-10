package com.anudip.hb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Courses {

	@Id
	@Column(length = 50,nullable = false)
	private int coursesDone;
	@Column(length = 50,nullable = false)
	private String coursesName;
	@Column(length = 50,nullable = false)
	private String coursesUniversity;
	@Column(length = 50,nullable = false)
	private String coursesCollege;
	
	
}
