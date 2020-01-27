package com.information.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.information.model.Users;
import com.information.service.LoginService;

@RestController
@RequestMapping("api")
public class LoginController{

	@Autowired
	private LoginService loginService;

	@PostMapping(value="login")
	@CrossOrigin
	public boolean login(@RequestBody Users user) {
		return loginService.login(user);
	}
}