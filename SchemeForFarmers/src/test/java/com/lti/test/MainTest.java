package com.lti.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.controller.Controller;
import com.lti.entity.Admin;
import com.lti.entity.Bidder;
import com.lti.entity.BidderAddress;
import com.lti.entity.BidderBank;
import com.lti.entity.Farmer;
import com.lti.entity.FarmerAddress;
import com.lti.entity.FarmerBank;
import com.lti.entity.FarmerLand;

public class MainTest {
	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	Controller controller = context.getBean(Controller.class);

	@Test
	public void addOrUpdateFarmer() {
		Farmer farmer = new Farmer();
		farmer.setFarmerName("Sowmya");
		farmer.setFarmerEmail("sowmya@gmail.com");
		farmer.setFarmerContactNo("973757569");
		farmer.setFarmerPassword("12345");
		farmer.setFarmerApprove("No");
		
		FarmerAddress address = new FarmerAddress();
		address.setAddressLine1("krishna nagar");
		address.setAddressLine2("Perambur");
		address.setCity("Chennai");
		address.setState("TamilNadu");
		address.setPincode("600110");
		address.setFarmer(farmer);
		farmer.setFarmerAddress(address);
		
		FarmerBank bank = new FarmerBank();
		bank.setIFSC_code("IDIB909");
		bank.setFarmer(farmer);
		farmer.setFarmerBank(bank);
		
		FarmerLand land = new FarmerLand();
 		land.setArea("Permabur");
		land.setAddress("Anna nagar");
		land.setPincode("600110");
		land.setFarmer(farmer);
		farmer.setFarmerLand(land);
		
		long id = controller.addOrUpdateFarmer(farmer);
		System.out.println("Farmer added" + id);
	}
	@Test
	public void isValidUser() {
		String s = controller.isValidUser("yash@gmail.com","yash123");
		System.out.println("User is : " + s);
	}
	@Test
	public void addOrUpdateBidder() {
		Bidder bidder = new Bidder();
		bidder.setBidderName("Kaviya");
		bidder.setBidderEmail("kavi72@gmail.com");
		bidder.setBidderContactNo("697353784");
		bidder.setBidderPassword("kavi123");
		bidder.setBidderApprove("No");
		
		BidderAddress address = new BidderAddress();
		address.setAddressLine1("T nagar");
		address.setAddressLine2("Mambalam");
		address.setCity("Chennai");
		address.setState("TamilNadu");
		address.setPincode("60004");
		address.setBidder(bidder);
		bidder.setBidderAddress(address);
		
		BidderBank bank = new BidderBank();
		bank.setIFSC_code("HDFC82");
		bank.setBidder(bidder);
		bidder.setBidderBank(bank);
		
		long id = controller.addOrUpdateBidder(bidder);
		System.out.println("bidder added: " + id);
	}
	@Test
	public void addOrUpdateAdmin() {
		Admin admin = new Admin();
		admin.setAdminEmail("yash@gmail.com");
		admin.setAdminPassword("yash123");
		long id = controller.addOrUpdateAdmin(admin);
		System.out.println("Admin added: "+id);
	}
}
