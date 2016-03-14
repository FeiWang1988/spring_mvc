package com.netease.spring_mvc.service;

import java.util.List;

import com.netease.spring_mvc.meta.User;



public interface IUserService {
	
	public List<User> getUserList();
	
	public Integer getUserId(User user);
}
