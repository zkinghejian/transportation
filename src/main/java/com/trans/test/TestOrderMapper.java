package com.trans.test;


import java.io.InputStream;
import java.sql.Timestamp;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.trans.mapper.OrderMapper;
import com.trans.mapper.UserMapper;
import com.trans.pojo.Order;
import com.trans.pojo.User;

public class TestOrderMapper {
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
		OrderMapper mapper = session.getMapper(OrderMapper.class);
		Order order = new Order();
		order.setOrder_id("trans"+System.currentTimeMillis());
		order.setCar_num("湘A88888");
		order.setCar_type("奥迪Q5");
		order.setPhoneno("13188888888");
		order.setCar_pro("发动机没电了");
		Timestamp time = Timestamp.valueOf(new Date().toLocaleString());
		System.out.println(time);
		order.setOrder_time(time);
		int i = mapper.addOrder(order);
		
		System.out.println(i);
		
	}
	
	@After
	public void after() {
		session.commit();
		session.close();
	}

}
