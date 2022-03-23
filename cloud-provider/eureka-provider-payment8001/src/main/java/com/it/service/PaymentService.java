package com.it.service;

import com.it.common.entity.PaymentEntity;

/**
 * 描述 ：
 *
 * @author : 小糊涂
 * @version : 1.0
 **/
public interface PaymentService {
    public int create(PaymentEntity payment);

    public PaymentEntity getPaymentById(Long id);

}
