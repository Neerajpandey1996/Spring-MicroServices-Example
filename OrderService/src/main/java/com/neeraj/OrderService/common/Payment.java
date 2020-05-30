package com.neeraj.OrderService.common;

public class Payment 
{
	public Payment()
	{
		
	}
	

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentStatus=" + paymentStatus + ", transectionId="
				+ transectionId + ", orderId=" + orderId + ", amount=" + amount + "]";
	}

	private int paymentId;
	
	private String paymentStatus;
	
	private String transectionId;
	
	private int orderId;
	
	private double amount;
	

	public Payment(int paymentId, String paymentStatus, String transectionId, int orderId, int amount) {
		super();
		this.paymentId = paymentId;
		this.paymentStatus = paymentStatus;
		this.transectionId = transectionId;
		this.orderId = orderId;
		this.amount = amount;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public double  getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public int getPaymentId() {
		return paymentId;
	}


	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}


	public String getPaymentStatus() {
		return paymentStatus;
	}


	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}


	public String getTransectionId() {
		return transectionId;
	}


	public void setTransectionId(String transectionId) {
		this.transectionId = transectionId;
	}
	
	
	
	
	
}
