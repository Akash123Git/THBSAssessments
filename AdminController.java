package com.sboot.Ecom.controller;

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
	public Admin getAdminDetails(){
		
		//Admin admin=adminService.getAdminDetails();
		return null;
	}
}
