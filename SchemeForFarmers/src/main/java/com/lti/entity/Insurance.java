package com.lti.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Insurance {
	@Id
	@SequenceGenerator(name="seq_insurance",initialValue=5000,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_insurance")
	long insuranceId;
	double amount;
	String insuranceCompanyName;
	
	@OneToOne
	@JoinColumn(name="cropId")
	Crop crop;
	
	@OneToMany(mappedBy="insurance",cascade=CascadeType.ALL)
	List<ApplyInsurance> applyInsurance;
}
