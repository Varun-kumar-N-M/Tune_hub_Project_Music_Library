package com.example.th.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.th.entities.Users;
import com.example.th.services.UsersService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UsersController {
	@Autowired
	UsersService userv;
	
	
	@PostMapping("/register")
	public String addUser(@ModelAttribute Users user) {
		boolean userstatus=userv.emailExists(user.getEmail());
		if(userstatus==false) {
			userv.addUser(user);
			return"registersuccess";
		}
		else {
			return "registerfail";
		}
		
	}
	@PostMapping("/login")
	public String validateUser(@RequestParam String email,@RequestParam String password) {
		
		if(userv.validateUser(email,password)==true) {
			if(userv.getRole(email).equals("admin")){
			return "adminhome";
		}
		else {
		return "customerhome";
	}
	}
		else {
			return "loginfail";
		}
}
}
