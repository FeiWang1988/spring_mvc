package com.netease.spring_mvc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.netease.spring_mvc.dao.UserDao;
import com.netease.spring_mvc.meta.User;
import com.netease.spring_mvc.service.IUserService;

@Component
public class UserService implements IUserService {

	@Resource
	private UserDao userDao;


	public List<User> getUserList() {
		return userDao.getUserList();
	}


	/* (·Ç Javadoc) 
	* <p>Title: getUser</p> 
	* <p>Description: </p> 
	* @param user
	* @return 
	* @see com.netease.spring_mvc.service.IUserService#getUser(com.netease.spring_mvc.meta.User) 
	*/
	@Override
	public Integer getUserId(User user) {
		// TODO Auto-generated method stub
		return userDao.getUserId(user);
	}

}
