package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Bid {
	@Id
	@SequenceGenerator(name="seq_bid",initialValue=500,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_bid")
	long bidId;
	double bidAmount;
	LocalDate bidDate;
	String bidApprove;
	String bidSold;
	
	@OneToOne
	@JoinColumn(name="cropId")
	Crop crop;
	
}
