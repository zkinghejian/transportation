package com.trans.action;


import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.trans.pojo.User;
import com.trans.service.OrderService;
import com.trans.service.UserService;

@Controller
@RequestMapping(value= "/user")
// 设置session
//@SessionAttributes(names= {"user","msg"})
public class UserAction{
	
	@Resource(name="userServiceImpl")
    private UserService userService;
	
	@Resource
    private OrderService orderService;
	// json 响应方式 produces="text/html; charset=utf-8" 响应格式
	//@ResponseBody 
	//@RequestMapping(value= "/login")
	public String logintest(String phoneno,String password) throws Exception {
		System.out.println(phoneno+"  "+password);
		Map<String,Object> str = userService.login(phoneno, password);
		System.out.println(str);
		return "";
	}
	
	@RequestMapping(value= {"/register"})
	public String register(String username,String password,String phoneno) throws Exception {
		int i = userService.register(username, password, phoneno);
		return "redirect:../login.jsp";
	}
	
	@RequestMapping(value= {"/login"})
	public String login(String phoneno,String password,HttpSession session) throws Exception {
		
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
	
	// 退出登录
	@RequestMapping(value= {"/logout"})
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:../login.jsp";
	}
	
	// 主页游客提价的信息
	@RequestMapping(value = {"/indexInfo"})
	@ResponseBody
	public String indexInfo(String username,String email,String phoneno,String problem) throws Exception {
		String str = userService.indexInfo(username, email, phoneno, problem);
		return str;
	}
	
	// 主页游客提价的信息
	@RequestMapping(value = {"/checkPhoneno"})
	@ResponseBody
	public String checkPhoneno(String phoneno) throws Exception {
		String str = userService.checkPhoneno(phoneno);
		return str;
	}
	
	@ResponseBody
	@RequestMapping(value= {"/yueyu"},method=RequestMethod.POST)
	public String yueyu(@RequestParam MultipartFile[] uploadfile,String car_type, String car_num, String car_pro, String order_time ,HttpSession session) {
		User user = (User)session.getAttribute("user");
		System.out.println(order_time);
		String phoneno = user.getPhoneno();
		String str = orderService.addOrder(uploadfile, phoneno, car_type, car_num, car_pro, order_time);
		
		return str;
	}
}
