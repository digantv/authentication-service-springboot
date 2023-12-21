package org.dnyanyog.controller;

import org.dnyanyog.dto.AddUserRequest;
import org.dnyanyog.dto.AddUserResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@PostMapping(path = "/api/auth/add-user")
	public AddUserResponse adduser(@RequestBody AddUserRequest addUserRequest) {
		AddUserResponse response = new AddUserResponse();

		response.setStatus("Success");
		response.setMessage("User successfully added");
		response.setUserId(addUserRequest.getUserId());
		response.setUserName(addUserRequest.getUserName());
		response.setUserEmail(addUserRequest.getUserEmail());
		response.setUserAge(addUserRequest.getUserAge());

		return response;

	}
}
