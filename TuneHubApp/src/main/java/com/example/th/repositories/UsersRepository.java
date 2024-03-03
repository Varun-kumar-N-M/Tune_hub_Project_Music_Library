package com.example.th.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.th.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{
	public Users findByEmail(String email);
	

}
