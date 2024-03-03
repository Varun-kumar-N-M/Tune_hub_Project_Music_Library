package com.example.th.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.th.entities.Users;
import com.example.th.repositories.UsersRepository;

@Service // Add this annotation to mark this class as a Spring service
public class UsersServiceImplementation implements UsersService {

    @Autowired
    UsersRepository repo;

    @Override
    public String addUser(Users user) {
        repo.save(user);
        return "User is created and saved";
    }
    public boolean emailExists(String email) {
    	if(repo.findByEmail(email)==null) {
    		return false;
    	}
    	else {
    		return true;
    	}
    }
    @Override
    public boolean validateUser(String email,String password) {
    	Users user=repo.findByEmail(email);
    	String db_password=user.getPassword();
    	if(db_password.equals(password)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    	
    }
    @Override
    public String getRole(String email) {
    	return(repo.findByEmail(email).getRole());
    }
}

	