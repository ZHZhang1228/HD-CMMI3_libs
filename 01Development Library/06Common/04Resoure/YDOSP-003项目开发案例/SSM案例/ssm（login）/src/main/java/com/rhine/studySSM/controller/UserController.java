package com.rhine.studySSM.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rhine.studySSM.domain.Users;
import com.rhine.studySSM.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
    IUserService userService;

    @RequestMapping("/login")
    public String login(Users user, Model model, HttpServletRequest req) {
    	System.out.println("测试！"+user.getUsername()+user.getPassword());
    	
        HttpSession session = req.getSession();
        
        if(user != null) {
            Users loginUser = userService.userlogin(user);
            if(loginUser != null) {
                System.out.println("登录成功");
                session.setAttribute("user", loginUser);
                return "homepage/index";
            }else {
                System.out.println("登录失败");
                return "fail";
            } 
        }
        return "fail";
    }

}
