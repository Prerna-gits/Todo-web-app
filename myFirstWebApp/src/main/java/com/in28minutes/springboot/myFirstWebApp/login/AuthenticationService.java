package com.in28minutes.springboot.myFirstWebApp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    
	public boolean Authenticate(String username,String password) {
		boolean isValidUsername=username.equalsIgnoreCase("in28minutes");
		boolean isValidPassword=password.equalsIgnoreCase("password");
		return isValidUsername && isValidPassword;
	}
	
	
}
