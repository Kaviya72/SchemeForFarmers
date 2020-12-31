package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Admin;
import com.lti.entity.Bidder;

@Repository
public class AdminRepositoryImpl implements AdminRepository {
	@PersistenceContext
	EntityManager em;

	@Transactional
	public long addOrUpdateAdmin(Admin admin) {
		Admin a = em.merge(admin);
		return a.getAdminId();
	}

	@Transactional
	public boolean isValidUser(String adminEmail, String adminPassword) {
		try {
			String jpql = "select a from Admin a where adminEmail=:aEmail and adminPassword=:aPassword";
			Query query = em.createQuery(jpql);
			query.setParameter("aEmail", adminEmail);
			query.setParameter("aPassword", adminPassword);
			Admin admin = (Admin) query.getSingleResult();
			if (admin != null)
				return true;
		} catch (Exception e) {
			return false;
		}
		return false;
	}

}
