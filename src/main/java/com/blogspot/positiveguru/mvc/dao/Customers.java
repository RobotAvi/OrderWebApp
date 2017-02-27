package com.blogspot.positiveguru.mvc.dao;



import com.blogspot.positiveguru.mvc.bean.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import javax.annotation.PostConstruct;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class Customers implements CustomersDAOInterface {

    @Autowired
    DataSource dataSource;

    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void init() {
        System.out.println("Customers postConstruct is called. datasource = " + dataSource);
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Customer> queryAllCustomers() {
        System.out.println("Customers: queryAllCustomers is called");
        final String QUERY_SQL = "SELECT * FROM Customers ORDER BY IDCustomer";
        List<Customer> CustomerList = this.jdbcTemplate.query(QUERY_SQL, (resultSet, rowNum) -> {
            Customer Customer = new Customer();
            Customer.setIdCustomer(resultSet.getInt("IDCustomer"));
            Customer.setCustomerName(resultSet.getString("CustomerNAME"));
            Customer.setDescription(resultSet.getString("Description"));
            return Customer;
        });
        return CustomerList;
    }

    @Override
    public int addCustomers(String customerName, String description) {
        return 0;
    }

    @Override
    public int queryCustomers() {
        return 0;
    }

    @Override
    public int updateCustomer(int idCustomer, String customerName, String description) {
        return 0;
    }

    @Override
    public int removeCustomer(int idCustomer) {
        System.out.println("Customers: queryAllCustomers is called");
        final String DELETE_SQL = "DELETE * FROM Customers WHERE IDCustomer=?";
        int result = this.jdbcTemplate.update(DELETE_SQL, new Object[]{idCustomer} );

        return result;
    }
}
