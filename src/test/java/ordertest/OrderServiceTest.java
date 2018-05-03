package ordertest;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.trans.pojo.Order;
import com.trans.pojo.Page;
import com.trans.service.OrderService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring/springmvc.xml","classpath:spring/spring-*.xml"})
public class OrderServiceTest {
	@Resource
	private OrderService orderService;
	
	@Test
	public void testAddOrder() {
		String str = orderService.addOrder(null, "13188888888", "audi", null, "不好开", "2018-04-26 12:34:12.0");
		System.out.println(str);
		//System.out.println("=======");
	}
	
	@Test
	public void testGetOrdersByPhoneno() {
		List<Order> orders = orderService.getOrdersByPhoneno("13188888888");
		for (Order order : orders) {
			System.out.println(order);
		}
	}
	
	@Test
	public void pageTestT() {
		Page<Order> page = orderService.pageTest("1",null,"5","13188888888");
		for (Order order : page.getResults()) {
			System.out.println(order);
		}
		
		System.out.println(page);
	}
	
}
