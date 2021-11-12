package com.xmj.payment8001.service.impl;

import com.xmj.payment8001.dao.PaymentDao;
import com.xmj.payment8001.entities.Payment;
import com.xmj.payment8001.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;
    public int create(Payment payment){
        return paymentDao.create(payment);
    }
    public Payment getPaymentById(@Param("id") Long id){
        return paymentDao.getPaymentById(id);
    }
}
