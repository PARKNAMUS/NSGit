package park.spring.store.controller;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import park.spring.store.service.PlaceOrderService;
import park.spring.store.vo.PurcharseOrderResult;
import park.spring.store.vo.PurchaseOrderRequest;

public class OrderServiceTestThree {
	private PlaceOrderService placeOrderService;
	private AbstractApplicationContext context;
	public OrderServiceTestThree() {
		String [] configLocations = new String[] {"applicationContext.xml","transactionThree.xml"};
		context = new ClassPathXmlApplicationContext(configLocations);
		placeOrderService = (PlaceOrderService)context.getBean("placeOrderService");
	}
	public void order() {
		PurchaseOrderRequest orderRequest = new PurchaseOrderRequest();
		orderRequest.setItemId(2);
		orderRequest.setAddress("서울 강남구");
		PurcharseOrderResult orderResult = placeOrderService.order(orderRequest);
		System.out.println("주문상태 정보");
		System.out.println("아이템: "+orderResult.getItem().getId());
		System.out.println("가격"+orderResult.getPaymentInfo().getPrice());
	}
	public void close() {
		context.close();
	}
	public static void main(String[] args) {
		OrderServiceTestThree three = new OrderServiceTestThree();
		three.order();
		three.close();
	}
}
