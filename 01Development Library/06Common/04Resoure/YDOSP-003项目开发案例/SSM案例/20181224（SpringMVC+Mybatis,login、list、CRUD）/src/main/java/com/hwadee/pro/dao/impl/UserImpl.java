package com.hwadee.pro.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.hwadee.pro.dao.UserDaoI;
import com.hwadee.pro.model.users;
import com.hwadee.pro.util.*;

public class UserImpl implements UserDaoI {
	@Autowired
	private UserDaoI  userDao;

	public List<users> getAllUser() {
		// 获得会话对象
		SqlSession session = MyBatisUtil.getSqlSession(true);
		try {
			userDao = session.getMapper(UserDaoI.class);
			return userDao.getAllUser();
		} finally {
			session.close();
		}
	}

    public boolean userLogin(users user) {
    	// 获得会话对象
    	SqlSession session = MyBatisUtil.getSqlSession(true);
        boolean flag=false;
        try {
        	userDao = session.getMapper(UserDaoI.class);
        	userDao.userLogin(user);
        		flag = true;       	      	
        }finally {
			session.close();
		}
        return flag;
	}



}
