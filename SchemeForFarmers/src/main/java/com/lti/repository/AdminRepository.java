package com.lti.repository;

import com.lti.entity.Admin;

public interface AdminRepository {
	public long addOrUpdateAdmin(Admin admin);
	public boolean isValidUser(String adminEmail,String adminPassword);
}
