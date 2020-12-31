package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lti.entity.Admin;
import com.lti.entity.Bidder;
import com.lti.entity.Farmer;
import com.lti.service.AdminService;
import com.lti.service.BidderService;
import com.lti.service.FarmerService;

@Component
public class Controller {
	@Autowired
	FarmerService farmerService;
	@Autowired
	BidderService bidderService;
	@Autowired
	AdminService adminService;
	
	public long addOrUpdateFarmer(Farmer farmer) {
		return farmerService.addOrUpdateFarmer(farmer);
	}
	public String isValidUser(String Email,String Password) {
		boolean b = farmerService.isValidUser(Email, Password);
		if(b)
			return "farmer";
		else {
			boolean b1 = bidderService.isValidUser(Email, Password);
			if(b1)
				return "bidder";
			else {
				boolean b2 = adminService.isValidUser(Email, Password);
				if(b2)
					return "admin";
				else
					return "Invalid User";
			}
		}
	}
	public long addOrUpdateBidder(Bidder bidder) {
		return bidderService.addOrUpdateBidder(bidder);
	}
	public long addOrUpdateAdmin(Admin admin) {
		return adminService.addOrUpdateAdmin(admin);
	}
}
