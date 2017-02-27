package com.blogspot.positiveguru.mvc.dao;

import com.blogspot.positiveguru.mvc.bean.Order;

import java.util.List;


public interface OrdersDAOInterface {

    List<Order> queryAllOrders();
    int addOrders(String orderName, String description);
    int queryOrders();
    int updateOrder(int idOrder, String orderName, String description);
    int removeOrder(int idOrder);

}
