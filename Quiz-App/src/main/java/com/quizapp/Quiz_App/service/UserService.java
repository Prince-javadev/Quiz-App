package com.quizapp.Quiz_App.service;

import com.quizapp.Quiz_App.model.UserDtls;

public interface UserService {
	
	
	public UserDtls createUser(UserDtls user);

	public boolean checkEmail(String email);

}
