package com.lti.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Bidder {
	@Id
	@SequenceGenerator(name="seq_bidder",initialValue=100,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_bidder")
	long bidderId;
	String bidderName;
	String bidderContactNo;
	String bidderEmail;
	String bidderPassword;
	String bidderApprove;
	
	@OneToOne(mappedBy="bidder",cascade=CascadeType.ALL)
	BidderAddress bidderAddress;
	
	@OneToOne(mappedBy="bidder",cascade=CascadeType.ALL)
	BidderBank bidderBank;

	public long getBidderId() {
		return bidderId;
	}

	public void setBidderId(long bidderId) {
		this.bidderId = bidderId;
	}

	public String getBidderName() {
		return bidderName;
	}

	public void setBidderName(String bidderName) {
		this.bidderName = bidderName;
	}

	public String getBidderContactNo() {
		return bidderContactNo;
	}

	public void setBidderContactNo(String bidderContactNo) {
		this.bidderContactNo = bidderContactNo;
	}

	public String getBidderEmail() {
		return bidderEmail;
	}

	public void setBidderEmail(String bidderEmail) {
		this.bidderEmail = bidderEmail;
	}

	public String getBidderPassword() {
		return bidderPassword;
	}

	public void setBidderPassword(String bidderPassword) {
		this.bidderPassword = bidderPassword;
	}

	public String getBidderApprove() {
		return bidderApprove;
	}

	public void setBidderApprove(String bidderApprove) {
		this.bidderApprove = bidderApprove;
	}

	public BidderAddress getBidderAddress() {
		return bidderAddress;
	}

	public void setBidderAddress(BidderAddress bidderAddress) {
		this.bidderAddress = bidderAddress;
	}

	public BidderBank getBidderBank() {
		return bidderBank;
	}

	public void setBidderBank(BidderBank bidderBank) {
		this.bidderBank = bidderBank;
	}
	
}
