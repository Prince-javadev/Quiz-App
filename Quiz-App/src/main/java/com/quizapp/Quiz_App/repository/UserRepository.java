package com.quizapp.Quiz_App.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizapp.Quiz_App.model.UserDtls;

public interface UserRepository extends JpaRepository<UserDtls, Integer>{
	
	
	public boolean existsByEmail(String email);
	
	public Optional<UserDtls> findByEmail(String email);

}
