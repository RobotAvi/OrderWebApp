package com.blogspot.positiveguru.mvc.jdbc;

import com.blogspot.positiveguru.mvc.bean.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomersController {

    @Autowired
    Customers customers;

    @RequestMapping(value = "/jdbcQueryAllCustomers", method = RequestMethod.GET)
    public ModelAndView jdbcSelectAllCustomers() {
        System.out.println("Called jdbcSelectAllUsers()");
        List<Customer> customerList = customers.queryAllCustomers();
        return new ModelAndView("/jdbc/jdbc", "resultObject", customerList);
    }




}
