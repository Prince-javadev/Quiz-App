package com.quizapp.Quiz_App.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.quizapp.Quiz_App.model.UserDtls;

public interface UserRepository extends JpaRepository<UserDtls, Integer>{
	
	
	public boolean existsByEmail(String email);
	
	public UserDtls findByEmail(String email);

}
