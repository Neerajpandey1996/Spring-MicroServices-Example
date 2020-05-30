package com.neeraj.OrderService.common;

import com.neeraj.OrderService.entity.Order;

public class TransectionRequest 
{

	public TransectionRequest()
	{
		
	}
	
	private Payment payment;
	private Order order;
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "TransectionRequest [payment=" + payment + ", order=" + order + "]";
	}
	
	
	
}
