package com.quizapp.Quiz_App.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class UserDtls {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String fullName;
	
	private String email;
	
	private String address;
	
	private String qualification;
	
	private String password;
	
	private String role;
	
	
}
