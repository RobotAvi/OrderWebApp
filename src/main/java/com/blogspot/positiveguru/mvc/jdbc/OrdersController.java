package com.blogspot.positiveguru.mvc.jdbc;

import com.blogspot.positiveguru.mvc.bean.Customer;
import com.blogspot.positiveguru.mvc.dao.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class OrdersController {

    @Autowired
    Customers customers;

    @RequestMapping(value = "/jdbcQueryAllOrders", method = RequestMethod.POST)
    public ModelAndView jdbcSelectAllCustomers() {
        System.out.println("Called jdbcQueryAllOrders()");
        List<Customer> customerList = customers.queryAllCustomers();
        return new ModelAndView("/jdbc/Orders", "resultObject", customerList);
    }




}
