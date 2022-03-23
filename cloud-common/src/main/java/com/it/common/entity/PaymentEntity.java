package com.it.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 描述 ：
 *
 * @author : 小糊涂
 * @version : 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentEntity implements Serializable {

    private Long id;

    private String serial;

}


