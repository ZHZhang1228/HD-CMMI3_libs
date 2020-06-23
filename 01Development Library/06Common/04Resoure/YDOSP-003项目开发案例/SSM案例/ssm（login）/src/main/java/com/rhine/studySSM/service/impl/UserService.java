package com.rhine.studySSM.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rhine.studySSM.domain.Users;
import com.rhine.studySSM.mapper.UserMapper;
import com.rhine.studySSM.service.IUserService;

@Service
public class UserService implements IUserService{
	 @Resource
	    UserMapper userMapper;
	@Override
	public Users userlogin(Users user) {
		// TODO Auto-generated method stub
		return userMapper.userlogin(user);
	}

}
