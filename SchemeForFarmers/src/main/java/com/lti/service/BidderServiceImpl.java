package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lti.entity.Bidder;
import com.lti.repository.BidderRepository;
@Component
public class BidderServiceImpl implements BidderService {
	@Autowired
	BidderRepository bidderRepository;
	public long addOrUpdateBidder(Bidder bidder) {
		return bidderRepository.addOrUpdateBidder(bidder);
	}

	public boolean isValidUser(String bidderEmail, String bidderPassword) {
		// TODO Auto-generated method stub
		return bidderRepository.isValidUser(bidderEmail, bidderPassword);
	}

}
