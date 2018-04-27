package com.trans.service.impl;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.trans.mapper.OrderImgMapper;
import com.trans.mapper.OrderMapper;
import com.trans.pojo.Order;
import com.trans.pojo.OrderImg;
import com.trans.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
    
	@Resource
	private OrderMapper orderMapper;
	
	@Resource
	private OrderImgMapper orderImgMapper;
	
	
	@Transactional
	public String addOrder(MultipartFile[] uploadfile,String phoneno, String car_type, String car_num, String car_pro,
			String order_time) {
		Order order = new Order();
		String orderid = "order"+System.currentTimeMillis();
		order.setOrder_id(orderid);
		order.setCar_type(car_type);
		order.setCar_num(car_num);
		order.setOrder_time(Timestamp.valueOf(order_time));
		order.setPhoneno(phoneno);
		
		// 插入订单
		int i = orderMapper.addOrder(order);
		
		OrderImg orderimg = new OrderImg();
		orderimg.setImgUrl("./111.jsp");
		orderimg.setOrderId(orderid);
		// 插入对应的图片
		int j = orderImgMapper.insertImg(orderimg);
		
		
		return "success";
	}

	
}
