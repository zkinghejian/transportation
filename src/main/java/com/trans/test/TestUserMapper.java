package com.trans.test;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.trans.mapper.UserMapper;
import com.trans.pojo.User;

public class TestUserMapper {
    SqlSessionFactoryBuilder factorybuilder = null;
    SqlSessionFactory factory = null;
    SqlSession session = null;
	@Before
	public void setUpBeforeClass() throws Exception {
		factorybuilder = new SqlSessionFactoryBuilder();
		InputStream is = Resources.getResourceAsStream("mybatis/mybatis.cfg.xml");
		factory = factorybuilder.build(is);
		session = factory.openSession();
	}

	@Test
	public void test() {
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = new User("18144442222","java","123456");
		int i = mapper.register(user);
		
		System.out.println(i);
		
	}
	
	@After
	public void after() {
		session.commit();
		session.close();
	}

}
