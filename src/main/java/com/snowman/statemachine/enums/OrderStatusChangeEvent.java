package com.snowman.statemachine.enums;

/**
 * @Description 订单状态改变事件   支付，发货，确认收货
 * @Author Snowman1024
 * @Date 2020/11/24 14:49
 * @Version 1.0
 **/
public enum OrderStatusChangeEvent {

    PAYED(1, "支付"),
    DELIVERY(2, "发货"),
    RECEIVED(3, "确认收货");

    private int code;
    private String name;


    OrderStatusChangeEvent(int code, String name) {
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
        for (OrderStatusChangeEvent obj : values()) {
            if (obj.getCode() == code) {
                name = obj.getName();
                break;
            }
        }
        return name;
    }

}
