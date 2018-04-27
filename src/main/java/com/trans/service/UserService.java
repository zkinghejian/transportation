package com.trans.service;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

public interface UserService {

	Map<String,Object> login(String phoneno,String password);
	
	String indexInfo(String username, String email, String phoneno, String problem);
	
	String checkPhoneno(String phoneno);
	
	int register(String username, String password, String phoneno);
	
	
	
}
