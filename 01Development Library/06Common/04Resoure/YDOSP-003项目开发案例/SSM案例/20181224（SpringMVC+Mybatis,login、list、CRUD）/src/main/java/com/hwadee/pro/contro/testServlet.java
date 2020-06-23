package com.hwadee.pro.contro;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hwadee.pro.model.users;

/**
 * Servlet implementation class test
 */
@Controller
@RequestMapping("/test")
public class testServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
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
     * @see HttpServlet#HttpServlet()
     */
    public testServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	@RequestMapping("/test")
	public String tt(HttpServletRequest request) {
		System.out.println("nbnmbnmbm,nm");
		SqlSession session = null;
		session = sqlSessionFactory.openSession();
        List<users> listUser = session.selectList("com.hwadee.pro.mapper.usersMapper.findAllUser");
        
        request.setAttribute("listUser",listUser);
        for(int i = 0;i<listUser.size();i++) 
			  
			  System.out.println(listUser.get(i).getUsername()); 
		return "list";
		
	}

}
