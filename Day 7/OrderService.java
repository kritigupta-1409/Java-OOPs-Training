package queue;

import java.util.ArrayDeque;

import java.util.Deque;

public class OrderService {
	Deque<Order> allOrders=new ArrayDeque<>();
	
	void placeOrder(Order newOrder) {
		allOrders.offer(newOrder);
	}
	void showAllOrders() {
		for(Order ord:allOrders)
			System.out.println(ord);
	}
	void removeOrder() {
		allOrders.poll();
	}
	Order getNextOrder() {
		return allOrders.peek();
	}
}
