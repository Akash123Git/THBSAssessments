package com.sboot.Ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sboot.Ecom.model.Admin;
import com.sboot.Ecom.service.AdminService;

@RestController
@RequestMapping("/api")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@GetMapping("/admin")
	public List<Admin> getAdminDetails(){
		
		List<Admin> admin=adminService.getAdminDetails();
		return admin;
	}
}
