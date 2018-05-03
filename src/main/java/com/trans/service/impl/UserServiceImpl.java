package com.trans.service.impl;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.trans.mapper.UserMapper;
import com.trans.pojo.IndexInfo;
import com.trans.pojo.User;
import com.trans.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public Map<String,Object> login(String phoneno, String password) throws Exception {
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

	@Override
	public String indexInfo(String username, String email, String phoneno, String problem){
		String str = "失败";
		if(username!=null&&!username.trim().equals("")&&phoneno!=null&&!phoneno.trim().equals("")&&problem!=null&&!problem.trim().equals("")) {
			IndexInfo indexInfo = new IndexInfo();
			indexInfo.setUsername(username);
			indexInfo.setEmail(email);
			indexInfo.setPhoneno(phoneno);
			indexInfo.setProblem(problem);
			int i;
			try {
				i = userMapper.indexInfo(indexInfo);
				if(i>0) {
					str = "提交成功";
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			str = "信息不完整";
		}
		return str;
	}

	@Override
	public String checkPhoneno(String phoneno) throws Exception {
		int i = userMapper.checkPhoneno(phoneno);
		if(i>0) {
			return "手机号已注册";
		}else {
			
			return "手机号可用";
		}
	}

	@Override
	public int register(String username, String password, String phoneno) throws Exception {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setPhoneno(phoneno);
		int i = userMapper.register(user);
		return i;
	}

	

}
