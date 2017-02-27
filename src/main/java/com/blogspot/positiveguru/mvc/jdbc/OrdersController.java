package com.blogspot.positiveguru.mvc.jdbc;

import com.blogspot.positiveguru.mvc.bean.Order;
import com.blogspot.positiveguru.mvc.dao.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class OrdersController {

    @Autowired
    Orders corders;

    @RequestMapping(value = "/jdbcQueryAllOrders", method = RequestMethod.POST)
    public ModelAndView jdbcSelectAllOrders() {
        System.out.println("Called jdbcQueryAllOrders()");
        List<Order> corderList = corders.queryAllOrders();
        return new ModelAndView("/jdbc/Orders", "resultObject", corderList);
    }




}
