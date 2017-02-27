package com.blogspot.positiveguru.mvc.dao;

import com.blogspot.positiveguru.mvc.bean.Customer;

import java.util.List;


public interface CustomersDAOInterface {

    List<Customer> queryAllCustomers();
    int addCustomers(String customerName,String description);
    int queryCustomers();
    int updateCustomer(int idCustomer,String customerName,String description);
    int removeCustomer(int idCustomer);

}
