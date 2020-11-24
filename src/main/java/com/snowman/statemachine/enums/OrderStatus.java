package com.snowman.statemachine.enums;

/**
 * @Description 订单状态  待支付，待发货，待收货，已完成
 * @Author Snowman1024
 * @Date 2020/11/24 14:49
 * @Version 1.0
 **/
public enum OrderStatus {

    WAIT_PAYMENT(1, "待支付"),
    WAIT_DELIVER(2, "待发货"),
    WAIT_RECEIVE(3, "待收货"),
    FINISH(4, "已完成");

    private int code;
    private String name;


    OrderStatus(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }


    public static String getName(int code) {
        String name = "";
        for (OrderStatus obj : values()) {
            if (obj.getCode() == code) {
                name = obj.getName();
                break;
            }
        }
        return name;
    }

}
