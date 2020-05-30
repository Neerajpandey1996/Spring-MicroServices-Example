package com.neeraj.APIGateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FeedBackController 
{
	@RequestMapping("/orderFallBack")
	public Mono<String> showFollbackMessageForOrderService()
	{
		return Mono.just("Order Service is taking too much time to respond or down , please try again later");
	}
	
	@RequestMapping("/paymentFallBack")
	public Mono<String> showFollbackMessageForPaymentService()
	{
		return Mono.just("Payment Service is taking too much time to respond or down , please try again later");
	}

}
