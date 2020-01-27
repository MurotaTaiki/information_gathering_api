package com.information.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.information.model.Info;
import com.information.model.Users;
import com.information.repository.UsersRepository;

@Service
public class ApiService {

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

	public List<Info> getInfo(String userId) {
		Optional<Users> user = usersRepository.findById(userId);
		List<Info> info = new ArrayList<>();
		user.ifPresent(u -> u.getInfo().forEach(i -> info.add(i)));
		return info;
	}
}
