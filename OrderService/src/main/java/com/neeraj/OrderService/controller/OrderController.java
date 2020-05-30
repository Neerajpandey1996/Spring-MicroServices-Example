package com.neeraj.OrderService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.neeraj.OrderService.common.TransectionRequest;
import com.neeraj.OrderService.common.TransectionResponse;
import com.neeraj.OrderService.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController 
{

	@Autowired
	OrderService orderService;
    
	@PostMapping("/bookOrder")
	public TransectionResponse saveOrder(@RequestBody TransectionRequest request)
	{
		return orderService.saveDetails(request);
	}

}
