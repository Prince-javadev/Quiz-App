package com.quizapp.Quiz_App.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizapp.Quiz_App.model.UserDtls;
import com.quizapp.Quiz_App.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	


	@Autowired
	private UserRepository userRepo;
	
	
	@Override
	public UserDtls createUser(UserDtls user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}
	
	@Override
	public boolean checkEmail(String email) {
		// TODO Auto-generated method stub
		return userRepo.existsByEmail(email);
	}
	
	
}


