package com.anudip.hb.onetomany.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import lombok.Data;

@Data
@Entity
public class Learner {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sId;
	
	@Column(length = 30,nullable = false)
	private String sName;
	
	@Column(length = 30,nullable = false)
	private String sAddress;
	
	@Column(length = 30,nullable = false,unique = true)
	private String sPhone;
	
	
//	@ManyToOne(targetEntity = Trainer.class)
//	private Trainer trainer;
}
