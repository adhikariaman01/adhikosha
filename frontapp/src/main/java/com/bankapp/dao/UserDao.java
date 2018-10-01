package com.bankapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.bankapp.domain.User;

public interface UserDao extends CrudRepository<User, Long>{
	User findByUsername(String username);
	User findByEmail(String email);
}
