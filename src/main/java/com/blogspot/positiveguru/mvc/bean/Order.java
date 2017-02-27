package com.blogspot.positiveguru.mvc.bean;


public class Order {

    private int idOrder;
    private int idGift;
    private int idCustomer;
    private int orderCount;

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getIdGift() {
        return idGift;
    }

    public void setIdGift(int idGift) {
        this.idGift = idGift;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }
}
