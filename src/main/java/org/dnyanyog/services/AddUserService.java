package org.dnyanyog.services;

import org.dnyanyog.dto.AddUserRequest;
import org.dnyanyog.dto.AddUserResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AddUserService {

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
