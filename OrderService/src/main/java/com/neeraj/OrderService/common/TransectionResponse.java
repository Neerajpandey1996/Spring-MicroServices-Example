package com.neeraj.OrderService.common;

import com.neeraj.OrderService.entity.Order;

public class TransectionResponse 
{

	
	public TransectionResponse()
	{
		
	}
	public TransectionResponse(Order order, double amount, String transectionId, String message) {
		super();
		this.order = order;
		this.amount = amount;
		this.transectionId = transectionId;
		this.message = message;
	}

	@Override
	public String toString() {
		return "TransectionResponse [order=" + order + ", amount=" + amount + ", transectionId=" + transectionId
				+ ", message=" + message + "]";
	}

	private Order order;
	
	private double amount;
	
	private String transectionId;
	
	private String message;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getTransectionId() {
		return transectionId;
	}

	public void setTransectionId(String transectionId) {
		this.transectionId = transectionId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
}
