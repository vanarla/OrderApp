package com.capgemini.order.modal;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="orderstable")
public class Order {
	
	private int orderId;
	private int customerId;
	private int productId;
	private LocalDate date;
	
	public Order() {
		super();
	}
	
	public Order(int orderId, int customerId, int productId, LocalDate date) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.productId = productId;
		this.date = date;
	}

	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
}
