package com.trans.mapper;

import java.util.Map;

import com.trans.pojo.IndexInfo;
import com.trans.pojo.Order;
import com.trans.pojo.User;

public interface UserMapper {
	User login(Map<String,String> map) throws Exception;
	
	int register(User user) throws Exception;
	
	// 登录成功修改登录时间
	void updateLoginTime(String phoneno) throws Exception;
	
	// 处理主页提交的信息
	int indexInfo(IndexInfo indexInfo) throws Exception;
	
	int checkPhoneno(String phoneno) throws Exception;
	
	int yuyue(Order order) throws Exception;
	
	int yuyueImg(Map<String,String> map) throws Exception;
}
