package com.hwadee.pro.contro;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hwadee.pro.dao.UserDaoI;
import com.hwadee.pro.dao.impl.UserImpl;
import com.hwadee.pro.model.users;

import java.io.Reader;
import java.io.UnsupportedEncodingException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

@Controller
@RequestMapping("/login")
public class LoginContro {
	// static UserDaoI userDao;
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

	// @RequestMapping(value="/login",method = RequestMethod.POST)
	@RequestMapping("/login")
	public String login(@ModelAttribute("SpringWeb") users user, ModelMap model) {
		/*
		 * String name = null; try { name = new
		 * String(user.getUsername().getBytes("ISO-8859-1"), "GBK"); } catch
		 * (UnsupportedEncodingException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		System.out.println(user.getUsername());

		SqlSession session = null;
		session = sqlSessionFactory.openSession();
		try {
			user = (users) session.selectOne("com.hwadee.pro.mapper.usersMapper.findUserByName", user.getUsername());
			if (user == null)
				return "failure";
			else
				return "success";
		} finally {
			session.close();
		}

	}

}
