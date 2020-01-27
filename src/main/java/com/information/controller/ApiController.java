package com.information.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.information.model.Info;
import com.information.model.Users;
import com.information.service.ApiService;

@RestController
@RequestMapping("api")
public class ApiController{

	@Autowired
	private ApiService apiService;

	@PostMapping(value="login")
	@CrossOrigin
	public boolean login(@RequestBody Users user) {
		return apiService.login(user);
	}

	@PostMapping(value="info")
	@CrossOrigin
	public List<Info> getInfo(@RequestBody String str) {
//		なぜか語尾に=がついているため削除
		return apiService.getInfo(str.substring(0, str.length()-1));
	}
}
