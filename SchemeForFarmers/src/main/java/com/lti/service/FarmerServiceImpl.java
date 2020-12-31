package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lti.entity.Farmer;
import com.lti.repository.FarmerRepository;
@Component
public class FarmerServiceImpl implements FarmerService {
	@Autowired
	FarmerRepository farmerRepository;
	public long addOrUpdateFarmer(Farmer farmer) {
		return farmerRepository.addOrUpdateFarmer(farmer);
	}
	
	public boolean isValidUser(String farmerEmail,String farmerPassword) {
		return farmerRepository.isValidUser(farmerEmail, farmerPassword);
	}
}
