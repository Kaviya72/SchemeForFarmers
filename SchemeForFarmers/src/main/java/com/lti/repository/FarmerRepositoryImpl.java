package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Farmer;
@Repository
public class FarmerRepositoryImpl implements FarmerRepository {
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public long addOrUpdateFarmer(Farmer farmer) {
		Farmer f = em.merge(farmer);
		return f.getFarmerId();
	}
	@Transactional
	public boolean isValidUser(String farmerEmail,String farmerPassword) {
		try {
			String jpql = "select f from Farmer f where farmerEmail=:fEmail and farmerPassword=:fPassword";
			Query query = em.createQuery(jpql);
			query.setParameter("fEmail", farmerEmail);
			query.setParameter("fPassword", farmerPassword);
			Farmer farmers = (Farmer) query.getSingleResult();
			if(farmers!=null)
				return true;
		} catch (Exception e) {
			return false;
		}
		return false;
	}
}
