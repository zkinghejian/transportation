package ordertest;


import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.trans.mapper.UserMapper;
import com.trans.pojo.IndexInfo;
import com.trans.pojo.User;
import com.trans.service.UserService;
import com.trans.service.impl.UserServiceImpl;

public class TestUserMapper {
	/*
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
    */
	@Test
	public void test() {
		//UserMapper mapper = session.getMapper(UserMapper.class);
		UserService us = new UserServiceImpl();
		int i = us.register("18144442222", "java", "123456");
		
		
		
		System.out.println(i);
		
	}
	/*
	@Test
	public void testinfo() {
		UserMapper mapper = session.getMapper(UserMapper.class);
		IndexInfo indexInfo = new IndexInfo();
		indexInfo.setUsername("你好");
		indexInfo.setEmail("123#qq.com");
		indexInfo.setPhoneno("123");
		indexInfo.setProblem("车太便宜");
		int i = mapper.indexInfo(indexInfo);
		
		System.out.println(i);
	}
	
	@After
	public void after() {
		session.commit();
		session.close();
	}
	*/

}
