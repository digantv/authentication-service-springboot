package org.dnyanyog.services;

import org.dnyanyog.dto.UserRequest;
import org.dnyanyog.dto.UserResponse;
import org.dnyanyog.entity.Users;
import org.dnyanyog.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

	@Autowired
	UsersRepository userRepo;

	public UserResponse adduser(@RequestBody UserRequest userRequest) {
		UserResponse response = new UserResponse();

		Users usersTable = new Users();

		usersTable.setAge(userRequest.getAge());
		usersTable.setEmail(userRequest.getEmail());
		usersTable.setPassword(userRequest.getPassword());
		usersTable.setUserName(userRequest.getUsername());

		userRepo.save(usersTable);

		response.setStatus("Success");
		response.setMessage("User successfully added");
		response.setUserId(usersTable.getUserId());

		return response;

	}
}
