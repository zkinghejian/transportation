package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.trans.mapper.UserMapper;
import com.trans.pojo.User;

public class TestUserMapper {

	public static void main(String[] args) {
	    
		try {
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			InputStream inputStream=Resources.getResourceAsStream("mybatis/mybatis.cfg.xml");
			SqlSessionFactory sqlSessionFactory = builder.build(inputStream);
			SqlSession session = sqlSessionFactory.openSession();
			UserMapper um = session.getMapper(UserMapper.class);
			Map<String,String> map = new HashMap<String,String>();
			map.put("username", "13188888888");
			map.put("password", "admin");
			User user = um.login(map);
			System.out.println(user);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	     
	}
}
