package com.delivery.entities;

public class Order {

    private Integer code;
    private Double valueBasic;
    private Double discout;

    public Order() {
    }

    public Order(Integer code, Double valueBasic, Double discout) {
        this.code = code;
        this.valueBasic= valueBasic;
        this.discout = discout;
    }

    public Integer getCode() {
        return code;
    }

    public Double getValueBasic() {
        return valueBasic;
    }

    public Double getDiscout() {
        return discout;
    }
}
