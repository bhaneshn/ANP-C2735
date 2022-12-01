package com.anudip.hb.onetomany.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Trainer {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tId;
	
	@Column(length = 30,nullable = false)
	private String tName;
	
	@Column(length = 50,nullable = false)
	private String tEmail;
	
	@Column(length = 40,nullable = false)
	private String tSubject;
	
	@Column(length = 30,nullable = false)
	private String tBatchCode;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="tid")
	private List<Learner> learner;
}
