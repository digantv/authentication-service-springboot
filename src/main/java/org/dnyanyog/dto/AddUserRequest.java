package org.dnyanyog.dto;

public class AddUserRequest {

	private String action;
	private int userId;
	private String userName;
	private String userEmail;
	private int userAge;

	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
}
