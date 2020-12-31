package com.lti.service;

import com.lti.entity.Bidder;

public interface BidderService {
	public long addOrUpdateBidder(Bidder bidder);
	public boolean isValidUser(String bidderEmail,String bidderPassword);
}
