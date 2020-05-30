package com.neeraj.PaymentService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neeraj.PaymentService.entiry.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer>
{

	Payment findByOrderId(int orderId);

}
