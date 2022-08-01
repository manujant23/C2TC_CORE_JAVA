package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService_Service {
	
	@Autowired
	private OrderServiceRepository repository;
	
	public List<OrderService> listAll() 
	{
		return repository.findAll();
	}
	
	public OrderService get(Integer order_id) {
		// TODO Auto-generated method stub
		return repository.findById(order_id).get();
	}

	public void save(OrderService orderservice) 
	{
		repository.save(orderservice);
	}

	public void delete(Integer order_id) 
	{
		repository.deleteById(order_id);
	}

}
