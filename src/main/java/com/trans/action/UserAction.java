package com.trans.action;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.trans.service.UserService;

@Controller
@RequestMapping(value= "/user")
// 设置session
//@SessionAttributes(names= {"user","msg"})
public class UserAction{
	
	@Resource(name="userServiceImpl")
    private UserService userService;
	

	// json 响应方式 produces="text/html; charset=utf-8" 响应格式
	//@ResponseBody 
	//@RequestMapping(value= "/login")
	public String logintest(String phoneno,String password) {
		System.out.println(phoneno+"  "+password);
		Map<String,Object> str = userService.login(phoneno, password);
		System.out.println(str);
		return "";
	}
	
	
	@RequestMapping(value= {"/login"})
	public String login(String phoneno,String password,HttpSession session) {
		
		System.out.println(phoneno+"  "+password);
		Map<String,Object> info = userService.login(phoneno, password);
		if(info.get("msg").equals("success")) {
			session.setAttribute("user", info.get("user"));
			//session.setAttribute("msg", "");
			// 修改登录时间
			
			return "user";
		}else {
			session.setAttribute("msg", info.get("msg").toString());
			//System.out.println(info.get("msg").toString());
			return "redirect:../login.jsp";
		}
	}
	
	@RequestMapping(value= {"/logout"})
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:../login.jsp";
	}
}
