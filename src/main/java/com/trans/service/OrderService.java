package com.trans.service;

import org.springframework.web.multipart.MultipartFile;

import com.trans.pojo.OrderImg;

public interface OrderService {
	String addOrder(MultipartFile[] uploadfile,String phoneno,String car_type, String car_num, String car_pro, String order_time);
}
