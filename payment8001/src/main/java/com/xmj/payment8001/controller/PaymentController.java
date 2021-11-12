package com.xmj.payment8001.controller;

import com.xmj.payment8001.entities.CommonResult;
import com.xmj.payment8001.entities.Payment;
import com.xmj.payment8001.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @PostMapping(value="/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result=paymentService.create(payment);
        log.info("插入结果："+result);
        if(result>0){
            return new CommonResult(100,"插入成功",result);
        }
        else return new CommonResult(404,"插入失败");
    }
    @GetMapping(value="/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment result=paymentService.getPaymentById(id);
        log.info("查询结果："+result);
        if(result!=null){
            return new CommonResult(100,"查询成功",result);
        }
        else return new CommonResult(404,"查询失败");
    }
}
