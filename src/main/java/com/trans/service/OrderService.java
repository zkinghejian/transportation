package com.trans.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.trans.pojo.Order;
import com.trans.pojo.Page;

public interface OrderService {
    String addOrder (MultipartFile[] uploadfile,String phoneno,String car_type, String car_num, String car_pro, String order_time);
    
    List<Order> getOrdersByPhoneno(String phoneno);
    
    Page<Order> pageTest(String pageNo,String status,String pagesize,String phoneno);
    
    String quxiao(String orderId);
}
