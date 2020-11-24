package com.snowman.statemachine.service;

import com.snowman.statemachine.entity.Order;

import java.util.Map;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/11/24 15:49
 * @Version 1.0
 **/
public interface OrderService {

    /**
     * 创建订单
     *
     * @return
     */
    Order create();

    /**
     * 发起支付
     *
     * @param id
     * @return
     */
    Order pay(int id);

    /**
     * 订单发货
     *
     * @param id
     * @return
     */
    Order deliver(int id);

    /**
     * 订单收货
     *
     * @param id
     * @return
     */
    Order receive(int id);

    /**
     * 获取所有订单信息
     *
     * @return
     */
    Map<Integer, Order> getOrders();
}
