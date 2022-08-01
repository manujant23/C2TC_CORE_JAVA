package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceController 
{
	@Autowired
	private OrderService_Service service;
	
	@GetMapping("/orderservice")
	public List<OrderService> list()
	{
		System.out.println("welcome");
		return service.listAll();
	}
	
	@GetMapping("/orderservice/{order_id}")
	public ResponseEntity<OrderService> get (@PathVariable Integer order_id)
	{
		OrderService orderservice = service.get(order_id);
		return new ResponseEntity<OrderService>(orderservice, HttpStatus.OK);
		
	}
	
	@PostMapping("/orderservice")
	public void add(@RequestBody OrderService orderservice)
	{
		service.save(orderservice);
	}
	
	@PutMapping("/orderservice/{id}")
	public ResponseEntity<?> upadte(@RequestBody OrderService orderservice,@PathVariable Integer order_id)
	{
		try {
			OrderService existorderservice = service.get(order_id);
			service.save(orderservice);
			return new ResponseEntity<OrderService>(orderservice, HttpStatus.OK);
			
		} 
		catch (Exception e) 
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
	}
	
	@DeleteMapping("/orderservice/{id}")
	public void delete(@PathVariable Integer order_id)
	{
		service.delete(order_id);
	}
}
