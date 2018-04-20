package com.trans.mapper;

import java.util.List;

import com.trans.pojo.Order;

public interface OrderMapper {
	// 预约
	int addOrder(Order order);
	
	List<Order> getOrdersByPhoneno(String Phoneno);
}
