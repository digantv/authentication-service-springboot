package org.dnyanyog.controller;

import org.dnyanyog.dto.UserRequest;
import org.dnyanyog.dto.UserResponse;
import org.dnyanyog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	UserService addUserService;

	@PostMapping(path = "/api/auth/add-user", consumes = { "application/json", "application/xml" }, produces = {
			"application/json", "application/xml" })
	public UserResponse adduser(@RequestBody UserRequest addUserRequest) {
		return addUserService.adduser(addUserRequest);

	}
}
