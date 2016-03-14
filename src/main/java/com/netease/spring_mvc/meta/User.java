package com.netease.spring_mvc.meta;

public class User {
	private Long userId;
	private String userName;
	private String userPassword;
	/** 
	* @return userId 
	*/
	public Long getUserId() {
		return userId;
	}
	/** 
	* @param userId 要设置的 userId 
	*/
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/** 
	* @return userName 
	*/
	public String getUserName() {
		return userName;
	}
	/** 
	* @param userName 要设置的 userName 
	*/
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/** 
	* @return userPassword 
	*/
	public String getUserPassword() {
		return userPassword;
	}
	/** 
	* @param userPassword 要设置的 userPassword 
	*/
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	

}
