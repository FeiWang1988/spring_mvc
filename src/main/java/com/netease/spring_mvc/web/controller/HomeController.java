package com.netease.spring_mvc.web.controller;

import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.netease.spring_mvc.meta.User;
import com.netease.spring_mvc.service.IUserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Resource
	private IUserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(HttpSession session, Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		String loadName = (String) session.getAttribute("userName");
		if (loadName != null && !loadName.equals(""))
		{
			// 已经登录的直接跳转至主页
			return "redirect:users.html";
		}
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(String userName, String passWord, HttpSession session, Locale locale, Model model) {
		logger.info("login! The client locale is {}.", locale);
		User user = new User();
		user.setUserName(userName);
		user.setUserPassword(passWord);
		Integer id = userService.getUserId(user);
		if (id != null && id > 0)
		{
			// 登录后跳转至主页
			session.setAttribute("userName", userName);
			return "redirect:users.html";
		}
		else
		{
			return "error";
		}
	}

	@RequestMapping(value = "/users.html", method = RequestMethod.GET)
	public String userPage(HttpSession session, Locale locale, Model model) {
		logger.info("userPage! The client locale is {}.", locale);
		String loadName = (String) session.getAttribute("userName");
		if (loadName == null || loadName.equals(""))
		{
			return "error";
		}
		model.addAttribute("userName", loadName);
		List<User> list = userService.getUserList();

		for (User user : list)
		{
			System.out.println("id:" + user.getUserId() + " userName:" + user.getUserName());
		}

		model.addAttribute("userList", list);
		return "users";
	}

	@RequestMapping(value = "/users.json", method = RequestMethod.GET)
	public void userJson(HttpSession session, Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		String loadName = (String) session.getAttribute("userName");
		if (loadName == null || loadName.equals(""))
		{
			model.addAttribute("error", "Please login first！");
			return;
		}
		List<User> list = userService.getUserList();

		for (User user : list)
		{
			System.out.println("id:" + user.getUserId() + " userName:" + user.getUserName());
		}
		model.addAttribute("userList", list);
	}

}
