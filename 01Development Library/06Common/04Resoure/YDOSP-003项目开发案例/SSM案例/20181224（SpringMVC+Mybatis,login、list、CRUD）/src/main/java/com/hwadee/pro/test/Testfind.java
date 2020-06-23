package com.hwadee.pro.test;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.hwadee.pro.model.users;

public class Testfind {
	private static SqlSessionFactory sqlSessionFactory;
	private static Reader reader;
	static {
		try {
			reader = Resources.getResourceAsReader("MyBatisCfg.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ≤È’“
	 */
	public static void findUserByName(String username) {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			users employeer = (users) session.selectOne("com.hwadee.pro.mapper.usersMapper.findUserByName",username);
			if (employeer == null)
				System.out.println("null");
			else
				System.out.println(employeer.getPassword());
		} finally {
			session.close();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findUserByName("lisi");
	}

}
