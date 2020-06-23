package com.hwadee.pro.dao;

import java.util.List;

import com.hwadee.pro.model.users;

public interface UserDaoI {
	
	public boolean userLogin(users user);
	public List<users> getAllUser();
	
}
