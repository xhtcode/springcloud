package com.it.dao;

/**
 * 描述 ：
 *
 * @author : 小糊涂
 * @version : 1.0
 **/

import com.it.common.entity.PaymentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    public int create(PaymentEntity payment);

    public PaymentEntity getPaymentById(@Param("id") Long id);
}

