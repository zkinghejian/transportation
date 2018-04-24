package com.trans.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value= "/user")
public class UserAction{

	@RequestMapping(value= "/login")
	public String login(String username,String password) {
		System.out.println(username);
		System.out.println(password);
		return null;
	}
}
