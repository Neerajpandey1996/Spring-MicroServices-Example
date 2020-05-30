package com.neeraj.PaymentService.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neeraj.PaymentService.entiry.Payment;
import com.neeraj.PaymentService.repository.PaymentRepository;

@Service
public class PaymentService 
{

	@Autowired
	PaymentRepository paymentRepo;
	
	public Payment saveDetails(Payment payment)
	{
		payment.setPaymentStatus(paymentProcessing());
		payment.setTransectionId(UUID.randomUUID().toString());
		return paymentRepo.save(payment);
	}
	
	
	//this status should be come from third party API call .
	//since we are not using any api call here so we are taking payment status randomly
		public String paymentProcessing()
		{
			return new Random().nextBoolean()?"Success":"False";
		}


		public Payment findPaymentDetailByOrderId(int orderId) {
			// TODO Auto-generated method stub
			return paymentRepo.findByOrderId(orderId);
		}
}
