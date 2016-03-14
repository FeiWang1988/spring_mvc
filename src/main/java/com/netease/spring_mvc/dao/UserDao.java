package com.netease.spring_mvc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import com.netease.spring_mvc.meta.User;

public interface UserDao {

	@Results(
	{ @Result(property = "userId", column = "userId"), @Result(property = "userName", column = "userName") })
	@Select("select userId ,userName from User")
	public List<User> getUserList();
	
	@Select("select userId  from User where userName = #{userName } and userPassword = #{userPassword } limit 1")
	public Integer getUserId(User user);
}
