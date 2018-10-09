package com.capgemini.order.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.order.modal.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

	@Query("{'customerId':?0}")
	public List<Order> findByCustomerId(int customerId);
	

	
}
