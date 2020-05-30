package com.neeraj.PaymentService.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neeraj.PaymentService.entiry.Payment;
import com.neeraj.PaymentService.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController 
{

	@Autowired 
	PaymentService paymentService;
	
	@PostMapping("/doPayment")
	public Payment savePaymentDetail(@RequestBody Payment payment)
	{
		return paymentService.saveDetails(payment);
	}
	
	
	@GetMapping("/{orderId}")
	public Payment findPaymentDetailByOrderId(@PathVariable int orderId)
	{
		return paymentService.findPaymentDetailByOrderId(orderId);
	}
	

}