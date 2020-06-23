package com.hwadee.pro.contro;

import java.io.Reader;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hwadee.pro.model.users;

@Controller
@RequestMapping("/user")
public class userContro {
	
	//List<users> listUser;
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
	
	@RequestMapping("/findAllUser")
	//public String findAllUser(){
	public String findAllUser(@ModelAttribute("SpringWeb") users listUser, ModelMap model,HttpServletRequest request){
		System.out.println("555555555555");
		    SqlSession session = null;
			session = sqlSessionFactory.openSession();
			List<users> aa = session.selectList("com.hwadee.pro.mapper.usersMapper.findAllUser");
	        
	   //     request.setAttribute("listUser",listUser);
			for(int i = 0;i<aa.size();i++) 
				  
				  System.out.println(aa.get(i).getUsername()); 

	//		listUser = (users) aa;
	        return "list"; //没有页面结果
	    }
}
