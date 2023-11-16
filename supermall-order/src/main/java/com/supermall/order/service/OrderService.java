package com.supermall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.supermall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author dengxin
 * @email dengxin0807@gmail.com
 * @date 2023-11-16 19:34:07
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

