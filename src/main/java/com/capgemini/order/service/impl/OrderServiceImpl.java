package com.capgemini.order.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.order.exceptions.OrderAlReadyPresentException;
import com.capgemini.order.exceptions.OrderNotFoundException;
import com.capgemini.order.modal.Order;
import com.capgemini.order.repository.OrderRepository;
import com.capgemini.order.service.OrderService;

public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	@Override
	public Order addOrder(Order order) throws OrderAlReadyPresentException {
		Optional<Order> orderOptional=orderRepository.findById(order.getOrderId());
		if(!orderOptional.isPresent())
		return orderRepository.save(order);
		throw new OrderAlReadyPresentException("the order has already present in the list");
	}

	@Override
	public Order getOrderById(int orderId) throws OrderNotFoundException {
		Optional<Order> orderOptional=orderRepository.findById(orderId);
		if(orderOptional.isPresent())
		{
			return orderOptional.get();
		}
		throw new OrderNotFoundException("order does not found");
	}

	@Override
	public List<Order> getOrders() throws OrderNotFoundException {
		List<Order> order=orderRepository.findAll();
		if(!order.isEmpty())
		{
		return order;
		}
		throw new OrderNotFoundException("Orders does not found");
	}

	@Override
	public List<Order> getOrdersById(int customerId) {
		return orderRepository.findByCustomerId(customerId);
	}

	@Override
	public void removeOrder(Order order) {
		orderRepository.delete(order);
	}
}
