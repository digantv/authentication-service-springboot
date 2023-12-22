package org.dnyanyog.services;

import org.dnyanyog.dto.LoginRequest;
import org.dnyanyog.dto.LoginResponse;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public LoginResponse validate(LoginRequest loginRequest) {
		LoginResponse response = new LoginResponse();

		if (loginRequest.getUsername().equalsIgnoreCase("admin")
				&& loginRequest.getPassword().equalsIgnoreCase("admin123")) {
			response.setStatus("Success");
			response.setMessage("Login Successful");
		} else {
			response.setStatus("Fail");
			response.setMessage("Login Failed!");
		}

		return response;
	}
}
