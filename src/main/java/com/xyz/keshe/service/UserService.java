package com.xyz.keshe.service;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xyz.keshe.mapper.UserMapper;
import com.xyz.keshe.pojo.User;
import com.xyz.keshe.service.UserService;

@Service("userService")
@Transactional
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public List<User> selectAll() {
		return userMapper.selectAll();
	}
	
	public int selectUser(String usernum,String password) {
		int log=0;
		List<User> list;
		list=userMapper.selectuser(usernum,password);
		if(list.size()>0) log=1;
		return log;
	}
	public int insertUser(String username,String usernum,String  useremail,String password) {
		int log=0;
		List<User> list;
		list=userMapper.selectusers(username,usernum,useremail);
		if(list.size()>0) { log=2;}
		else if(list.size()==0) log=userMapper.insertUser(username, usernum, useremail, password);
		return log;
	}
}
