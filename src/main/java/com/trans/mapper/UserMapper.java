package com.trans.mapper;

import java.sql.Timestamp;
import java.util.Map;


import com.trans.pojo.User;

public interface UserMapper {
	User login(Map<String,String> map);
	
	int register(User user);
	
	// 登录成功修改登录时间
	void updateLoginTime(String phoneno);
	
}
