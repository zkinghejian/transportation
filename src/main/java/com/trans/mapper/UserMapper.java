package com.trans.mapper;

import java.util.Map;

import com.trans.pojo.User;

public interface UserMapper {
	User login(Map<String,String> map);
	
	int register(User user);
	
	
}
