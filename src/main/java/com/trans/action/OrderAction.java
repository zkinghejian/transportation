package com.trans.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.trans.pojo.Order;
import com.trans.pojo.Page;
import com.trans.pojo.User;
import com.trans.service.OrderService;

@Controller
@RequestMapping(value= "/order")
public class OrderAction {
	@Resource
    private OrderService orderService;
	
	@ResponseBody 
	@RequestMapping(value= {"/yueyuPage"},method=RequestMethod.POST)
	public Page<Order> orderPage(@RequestParam String pageNo,String status,String pagesize,HttpSession session){
		User user = (User)session.getAttribute("user");
		if(status.equals("null")) {
			status = null;
		}
		Page<Order> page = orderService.pageTest(pageNo, status, pagesize,user.getPhoneno());
		return page;
	}
	
	@ResponseBody 
	@RequestMapping(value= {"/quxiao"},method=RequestMethod.POST)
	public String orderQuxiao(@RequestParam String orderId){
		String str = orderService.quxiao(orderId);
		return str;
	}
}
