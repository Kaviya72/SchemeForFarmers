package com.lti.service;

import com.lti.entity.Admin;

public interface AdminService {
	public long addOrUpdateAdmin(Admin admin);
	public boolean isValidUser(String adminEmail,String adminPassword);
}
