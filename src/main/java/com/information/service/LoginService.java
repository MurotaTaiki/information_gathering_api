package com.information.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.information.model.Users;
import com.information.repository.UsersRepository;

@Service
public class LoginService {

	@Autowired
	private UsersRepository usersRepository;

	public boolean login(Users user) {
		List<Users> userList = usersRepository.findAll();
		List<Users> users = userList.stream()
		                      .filter(u -> u.getUserId().equals(user.getUserId()))
		                      .filter(u -> u.getPassword().equals(user.getPassword()))
		                      .collect(Collectors.toList());
		return users.size() == 1 ? true : false;
	}
}
