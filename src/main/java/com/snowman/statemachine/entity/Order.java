package com.snowman.statemachine.entity;

import com.snowman.statemachine.enums.OrderStatus;

/**
 * @Description
 * @Author Snowman1024
 * @Date 2020/11/24 15:26
 * @Version 1.0
 **/
public class Order {

    private int id;
    private OrderStatus status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status=" + status +
                '}';
    }
}
