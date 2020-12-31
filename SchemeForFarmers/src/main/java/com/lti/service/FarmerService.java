package com.lti.service;

import com.lti.entity.Farmer;

public interface FarmerService {
	public long addOrUpdateFarmer(Farmer farmer);
	public boolean isValidUser(String farmerEmail,String farmerPassword);
}
