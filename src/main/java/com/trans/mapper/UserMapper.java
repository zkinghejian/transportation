package com.trans.mapper;

import java.util.Map;

import com.trans.pojo.IndexInfo;
import com.trans.pojo.Order;
import com.trans.pojo.User;

public interface UserMapper {
	User login(Map<String,String> map);
	
	int register(User user);
	
	// 登录成功修改登录时间
	void updateLoginTime(String phoneno);
	
	// 处理主页提交的信息
	int indexInfo(IndexInfo indexInfo);
	
	int checkPhoneno(String phoneno);
	
	int yuyue(Order order);
	
	int yuyueImg(Map<String,String> map);
}
