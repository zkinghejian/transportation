package com.trans.mapper;

import java.util.List;


import com.trans.pojo.Order;
import com.trans.pojo.Page;

public interface OrderMapper {
	// 预约
	int addOrder(Order order) throws Exception;
	
	List<Order> getOrdersByPhoneno(String Phoneno) throws Exception;
	
	List<Order> pageTest(Page<Order> page) throws Exception;
	
	// 取消预约
	int quxiao(String orderId) throws Exception;
}
