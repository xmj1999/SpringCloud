package com.xmj.payment8001.service;

import com.xmj.payment8001.entities.Payment;
import org.springframework.data.repository.query.Param;

public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
