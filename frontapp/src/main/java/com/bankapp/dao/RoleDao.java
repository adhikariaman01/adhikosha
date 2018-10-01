package com.bankapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.bankapp.domain.security.Role;



public interface RoleDao extends CrudRepository<Role, Integer> {

	Role findByName(String name);
}
