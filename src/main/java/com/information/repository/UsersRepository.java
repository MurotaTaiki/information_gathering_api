package com.information.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.information.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, String>{

}
