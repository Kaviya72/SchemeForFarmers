package com.lti.repository;

import com.lti.entity.Farmer;

public interface FarmerRepository {
	public long addOrUpdateFarmer(Farmer farmer);
	public boolean isValidUser(String farmerEmail,String farmerPassword);
}
