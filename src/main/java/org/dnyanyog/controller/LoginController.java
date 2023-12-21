package org.dnyanyog.controller;

import org.dnyanyog.dto.LoginRequest;
import org.dnyanyog.dto.LoginResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@PostMapping(path = "/auth/validate")
	public LoginResponse validate(@RequestBody LoginRequest loginRequest) {

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
