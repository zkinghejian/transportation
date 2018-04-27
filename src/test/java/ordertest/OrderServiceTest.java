package ordertest;


import org.junit.Test;

import com.trans.service.OrderService;
import com.trans.service.impl.OrderServiceImpl;

public class OrderServiceTest {
	
	@Test
	public void testAddOrder() {
		OrderService os = new OrderServiceImpl();
		
		os.addOrder(null, "13188888888", "audi", "", "不好开", "2018-04-26 12:34:12.0");
		
	}

	
}
