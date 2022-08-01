package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class OrderService 
{
	private Integer order_Id;
	private	String	email;
	private String Customer_name;
	private String Order_status;
	
	
	public OrderService(Integer order_Id, String email, String Customer_name, String Order_status) 
	{
		
		super();
		this.order_Id = order_Id;
		this.email = email;
		this.Customer_name = Customer_name;
		this.Order_status = Order_status;
	}
	public OrderService()
	{
		super();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getOrder_Id() {
		return order_Id;
	}
	public void setOrder_Id(Integer order_Id) {
		this.order_Id = order_Id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCustomer_name() {
		return Customer_name;
	}
	public void setCustomer_name(String Customer_name) {
		this.Customer_name = Customer_name;
	}
	public String getOrder_status() {
		return Order_status;
	}
	public void setOrder_status(String Order_status) {
		this.Order_status = Order_status;
	}
	@Override
	public String toString() {
		return "OrderService [order_Id=" + order_Id + ", email=" + email + ", Customer_name=" + Customer_name
				+ ", Order_status=" + Order_status + "]";
	}
	
	
	
}
