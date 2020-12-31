package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
@Entity
public class SellRequest {
	@Id
	@SequenceGenerator(name="seq_request",initialValue=10,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_request")
	long requestId;
	double quantity;
	String approve;
	
	@OneToOne
	@JoinColumn(name="cropId")
	Crop crop;
	
	@ManyToOne
	@JoinColumn(name="farmerId")
	Farmer farmer;
}
