package com.cp.onlinewallet.dto;

public class SignUp {
	private int userId;
	private String userName;
	private String password;
	private String confirmPassword;
	private String phoneNumber;
	private String email;
	
	public SignUp(String userName,String password,String confirmPassword,String phoneNumber, String email) {
		//this.userId=userId;
		this.userName=userName;
		this.password=password;
		this.confirmPassword=confirmPassword;
		this.phoneNumber=phoneNumber;
		this.email=email;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "userId: "+userId+"userName: "+userName+"password: "+password+"confirmPassword: "+confirmPassword+"email: "+email+"phoneNumber: "+phoneNumber;
	}
	
	
}
