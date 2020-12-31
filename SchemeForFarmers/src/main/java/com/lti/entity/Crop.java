package com.lti.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Crop {
	@Id
	@SequenceGenerator(name="seq_crop",initialValue=300,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_crop")
	long CropId;
	String CropName;
	String CropType;
	double basePrice;
	
	@OneToOne(mappedBy="crop",cascade=CascadeType.ALL)
	SellRequest sellRequest;
	
	@OneToOne(mappedBy="crop",cascade=CascadeType.ALL)
	Bid bid;
	
	@OneToOne(mappedBy="crop",cascade=CascadeType.ALL)
	Insurance insurance;
	
	@OneToOne(mappedBy="crop",cascade=CascadeType.ALL)
	ApplyInsurance applyInsurance;
	
}
