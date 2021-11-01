package com.sboot.Ecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sboot.Ecom.dao.AdminRepository;
import com.sboot.Ecom.model.Admin;

@Service
public class AdminService {

	@Autowired
	private AdminRepository adminRepository;

	public List<Admin> getAdminDetails() {
		List<Admin> admindetails=adminRepository.findAll();
		return admindetails;
	}

}
