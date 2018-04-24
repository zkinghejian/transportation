package com.trans.service;

import java.util.Map;

public interface UserService {

	Map<String,Object> login(String phoneno,String password);
	
}
