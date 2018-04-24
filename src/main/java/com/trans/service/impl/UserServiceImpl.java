package com.trans.service.impl;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trans.mapper.UserMapper;
import com.trans.pojo.User;
import com.trans.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public Map<String,Object> login(String phoneno, String password) {
		Map<String, Object> info = new HashMap<String,Object>();
		String str = "success";
		
		if(phoneno!=null&&!phoneno.trim().equals("")&&password!=null&&!password.trim().equals("")) {
			Map<String, String> map = new HashMap<String,String>();
			map.put("username", phoneno);
			map.put("password", password);
			User user = userMapper.login(map);
			
			if(user==null) {
				str = "用户名或密码错误";
			}else {
				// 调用修改时间的方法
				userMapper.updateLoginTime(phoneno);
			}
			info.put("user", user);
			info.put("msg", str);
		}else {
			str="用户名或密码为空";
			info.put("user", null);
			info.put("msg", str);
		}
		
		return info;
	}

}
