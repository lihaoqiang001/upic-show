package com.xyz.keshe.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xyz.keshe.pojo.User;
import com.xyz.keshe.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/select")
	@ResponseBody
	public List<User> selectAll(HttpServletRequest request) {
		return userService.selectAll();
	} 
	
	/**
	 * 登录
	 * @return
	 */
//	@RequestMapping("/login")
//    public String login() {
//    	return "login";
//    } 
	
	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST )
	public Map<String,Object> login(HttpServletRequest request,@RequestParam("userName")String user,@RequestParam("userPwd")String password) {
		int log=0;
		Map<String,Object> map = new HashMap<>();
		log=userService.selectUser(user, password);
		map.put("isSuccess", 0);
		if(log==1)  
			map.put("isSuccess", 1);
		 return map;
	}
	
	/**
	 * 注册
	 * @return
	 */
//	@RequestMapping("/register")
//    public String register() {
//    	return "register";
//    } 
	@ResponseBody
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public Map<String,Object>  register(HttpServletRequest request,
			@RequestParam("userNumber")String  usernum,
			@RequestParam("userEmail")String email,
			@RequestParam("userName")String  name,
			@RequestParam("userPwd")String password,
			@RequestParam("pas")String pas
			) {
		int log=0;
		Map<String,Object> map = new HashMap<>();
		map.put("isSuccess", 0);
		if(password.equals(pas)) {
			log=userService.insertUser(name, usernum, email, password);
		}
		if(log==1) {
			map.put("isSuccess", 1);
		}
		  if(log==2){
			 map.put("error", "用户已存在");
		}
		  return map;
	}
}
