package com.blogspot.positiveguru.mvc.jdbc;

import com.blogspot.positiveguru.mvc.bean.Customer;

import java.util.List;

/**
 * Created by aveni on 2/27/2017.
 */
public interface CustomersDAOInterface {

    List<Customer> queryAllCustomers();
    int addCustomers(String customerName,String description);
    int queryCustomers();
    int updateCustomer(int idCustomer,String customerName,String description);
    int removeCustomer(int idCustomer);

}
