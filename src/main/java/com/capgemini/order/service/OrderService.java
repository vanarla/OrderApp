package com.capgemini.order.service;

import java.util.List;

import com.capgemini.order.exceptions.OrderAlReadyPresentException;
import com.capgemini.order.exceptions.OrderNotFoundException;
import com.capgemini.order.modal.Order;

public interface OrderService {
	
	public Order addOrder(Order order) throws OrderAlReadyPresentException;
	public void removeOrder(Order order);
	public Order getOrderById(int orderId) throws OrderNotFoundException;
	public List<Order> getOrders() throws OrderNotFoundException;
	public List<Order> getOrdersById(int customerId);

}
