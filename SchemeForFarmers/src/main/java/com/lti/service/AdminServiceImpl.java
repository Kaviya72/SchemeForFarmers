package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lti.entity.Admin;
import com.lti.repository.AdminRepository;
@Component
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminRepository adminRepository;
	public long addOrUpdateAdmin(Admin admin) {
		return adminRepository.addOrUpdateAdmin(admin);
	}
	public boolean isValidUser(String adminEmail,String adminPassword) {
		return adminRepository.isValidUser(adminEmail, adminPassword);
	}
}
