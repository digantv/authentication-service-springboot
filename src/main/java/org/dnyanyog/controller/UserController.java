package org.dnyanyog.controller;

import org.dnyanyog.dto.AddUserRequest;
import org.dnyanyog.dto.AddUserResponse;
import org.dnyanyog.services.AddUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	
	@Autowired
	AddUserService addUserService;
	
	
	@PostMapping(path = "/api/auth/add-user")
	public AddUserResponse adduser(@RequestBody AddUserRequest addUserRequest) {
		return addUserService.adduser(addUserRequest);

	}
}
