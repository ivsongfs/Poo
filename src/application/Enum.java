package application;

import java.util.Date;

import entites.enums.OrderStatus;
import entities.Order;

public class Enum {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.DELIVERED);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
