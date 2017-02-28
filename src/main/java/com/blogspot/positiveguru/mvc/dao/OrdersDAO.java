package com.blogspot.positiveguru.mvc.dao;


import com.blogspot.positiveguru.mvc.bean.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class OrdersDAO implements OrdersDAOInterface {

    @Autowired
    DataSource dataSource;

    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void init() {
        System.out.println("Orders postConstruct is called. datasource = " + dataSource);
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Order> queryAllOrders() {
        System.out.println("Orders: queryAllOrders is called");
        final String QUERY_SQL = "SELECT o.IDORDER, o.idCustomer, o.idGift, o.orderCount, c.CustomerName, g.giftName " +
                "FROM Orders o " +
                "INNER JOIN gifts g ON g.idgift=o.idgift " +
                "INNER JOIN customers c ON c.idcustomer=o.idgift;";

        List<Order> OrderList = this.jdbcTemplate.query(QUERY_SQL, (resultSet, rowNum) -> {
            Order Order = new Order();
            Order.setIdOrder(resultSet.getInt("IDOrder"));
            Order.setIdCustomer(resultSet.getInt("IdCustomer"));
            Order.setIdGift(resultSet.getInt("IdGift"));
            Order.setOrderCount(resultSet.getInt("ORDERCOUNT"));
            Order.setCustomerName(resultSet.getString("CustomerName"));
            Order.setGiftName(resultSet.getString("giftName"));
            return Order;
        });
        return OrderList;
    }

    @Override
    public int addOrders(String orderName, String description) {
        return 0;
    }

    @Override
    public int queryOrders() {
        return 0;
    }

    @Override
    public int updateOrder(int idOrder, String orderName, String description) {
        return 0;
    }

    @Override
    public int removeOrder(int idOrder) {
        System.out.println("Orders: queryAllOrders is called");
        final String DELETE_SQL = "DELETE * FROM Order WHERE IDOrder=?";
        int result = this.jdbcTemplate.update(DELETE_SQL, new Object[]{idOrder} );

        return result;
    }
}
