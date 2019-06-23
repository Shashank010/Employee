package com.cg.employeemaintainence.dto;

public class usermaster {
	String UserId;
	String UserName;
	String UserPassword;
	String UserType;
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	public String getUserType() {
		return UserType;
	}
	public void setUserType(String userType) {
		UserType = userType;
	}
	public usermaster(String userId, String userName, String userPassword,
			String userType) {
		super();
		UserId = userId;
		UserName = userName;
		UserPassword = userPassword;
		UserType = userType;
	}
	@Override
	public String toString() {
		return "usermaster [UserId=" + UserId + ", UserName=" + UserName
				+ ", UserPassword=" + UserPassword + ", UserType=" + UserType
				+ "]";
	}
	
	public  usermaster()
	{
		
	}
	
	
	

}
