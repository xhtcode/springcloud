package com.it.service.impl;

import com.it.common.entity.PaymentEntity;
import com.it.dao.PaymentDao;
import com.it.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 描述 ：
 *
 * @author : 小糊涂
 * @version : 1.0
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;


    @Override
    public int create(PaymentEntity payment) {
        return paymentDao.create(payment);
    }

    @Override
    public PaymentEntity getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
