package com.scaler.paymentservice.repositories;

//import org.springframework.data.jpa.repository.JpaRepository;

import com.scaler.paymentservice.models.Payment;

public interface PaymentRepository {
    Payment save(Payment payment);

    Payment findByPaymentGatewayReferenceId(String paymentGatewayReferenceId);
}
