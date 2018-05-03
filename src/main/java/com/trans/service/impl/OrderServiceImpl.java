package com.trans.service.impl;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.multipart.MultipartFile;

import com.trans.mapper.OrderImgMapper;
import com.trans.mapper.OrderMapper;
import com.trans.pojo.Order;
import com.trans.pojo.OrderImg;
import com.trans.pojo.Page;
import com.trans.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
    
	@Resource
	private OrderMapper orderMapper;
	
	@Resource
	private OrderImgMapper orderImgMapper;
	
	
	@Transactional(rollbackFor= {Exception.class})
	public String addOrder(MultipartFile[] uploadfile,String phoneno, String car_type, String car_num, String car_pro,
			String order_time) {
		String str = "预约提交成功";
		Order order = new Order();
		String orderid = "order"+System.currentTimeMillis();
		order.setOrder_id(orderid);
		order.setCar_type(car_type);
		order.setCar_num(car_num);
		order.setCar_pro(car_pro);
		
		try {
			order.setOrder_time(Timestamp.valueOf(order_time));
		} catch (Exception e1) {
		    return str = "预约时间必须正确填写";
		}
		order.setPhoneno(phoneno);
		
		// 插入订单
		try {
			orderMapper.addOrder(order);
			
			OrderImg orderimg = new OrderImg();
			orderimg.setImgUrl(phoneno);
			orderimg.setOrderId(orderid);
			// 插入对应的图片
			orderImgMapper.insertImg(orderimg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		    str = "预约提交失败";
			// 回滚事务
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		} 
		
		
		return str;
	}


	@Override
	public List<Order> getOrdersByPhoneno(String phoneno) {
		List<Order> orders = null;
		try {
			orders = orderMapper.getOrdersByPhoneno(phoneno);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return orders;
	}


	@Override
	public Page<Order> pageTest(String pageNo,String status,String pagesize,String phoneno){
		// TODO Auto-generated method stub
		System.out.println(status);
		Page<Order> page = new Page<Order>();
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("phoneno", phoneno);
		params.put("status", status);
		page.setParams(params);
		int pageno;
		try {
			pageno = Integer.parseInt(pageNo);
		} catch (NumberFormatException e) {
			pageno = 1;
		}
		int pageSize = Integer.parseInt(pagesize);
		page.setPageNo(pageno);
		page.setPageSize(pageSize);
		List<Order> results = null;
		try {
			results = orderMapper.pageTest(page);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		page.setResults(results);
		return page;
	}

	 
	@Override
	public String quxiao(String orderId) {
		String str = "success";
		try {
			int i = orderMapper.quxiao(orderId);
			
		} catch (Exception e) {
			str = "数据库异常";
		}
		
		return str;
	}
	
}
