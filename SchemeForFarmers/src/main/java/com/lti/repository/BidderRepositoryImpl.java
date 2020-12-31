package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.lti.entity.Bidder;
import com.lti.entity.Farmer;

@Repository
public class BidderRepositoryImpl implements BidderRepository {
	@PersistenceContext
	EntityManager em;

	@Transactional
	public long addOrUpdateBidder(Bidder bidder) {
		Bidder b = em.merge(bidder);
		return b.getBidderId();
	}

	@Transactional
	public boolean isValidUser(String bidderEmail, String bidderPassword) {
		try {
			String jpql = "select b from Bidder b where bidderEmail=:bEmail and bidderPassword=:bPassword";
			Query query = em.createQuery(jpql);
			query.setParameter("bEmail", bidderEmail);
			query.setParameter("bPassword", bidderPassword);
			Bidder bidders = (Bidder) query.getSingleResult();
			if (bidders != null)
				return true;
		} catch (Exception e) {
			return false;
		}
		return false;
	}

}
