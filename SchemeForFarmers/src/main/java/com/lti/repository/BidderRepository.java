package com.lti.repository;

import com.lti.entity.Bidder;

public interface BidderRepository {
	public long addOrUpdateBidder(Bidder bidder);
	public boolean isValidUser(String bidderEmail,String bidderPassword);
}
