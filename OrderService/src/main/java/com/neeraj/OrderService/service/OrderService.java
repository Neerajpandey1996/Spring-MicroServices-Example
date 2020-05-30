package com.neeraj.OrderService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.neeraj.OrderService.common.Payment;
import com.neeraj.OrderService.common.TransectionRequest;
import com.neeraj.OrderService.common.TransectionResponse;
import com.neeraj.OrderService.entity.Order;
import com.neeraj.OrderService.repository.OrderRepository;

@Service
public class OrderService 
{
	
	@Autowired
	OrderRepository orderRepo;
	
	
	@Autowired
	RestTemplate restTemplete;
	
	public TransectionResponse saveDetails(TransectionRequest request)
	{
		String message="";
		Order order=request.getOrder();
		Payment payment=request.getPayment();
		
		payment.setOrderId(order.getId());
		payment.setAmount(order.getPrice());
		
		//Rest Call
		
		Payment paymentResponce=restTemplete.postForObject("http://PAYMENT-SERVICE/payment/doPayment", payment,Payment.class);
		message=paymentResponce.getPaymentStatus().equals("Success")?"Payment Processing Sucessfull":"Payment not Successfull";
		
		orderRepo.save(order);
		
		return new TransectionResponse(order,paymentResponce.getAmount(),paymentResponce.getTransectionId(),message);
	}

}
