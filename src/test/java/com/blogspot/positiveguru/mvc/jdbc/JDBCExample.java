package com.blogspot.positiveguru.mvc.jdbc;



import com.blogspot.positiveguru.mvc.bean.User;
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
public class JDBCExample {

    @Autowired
    DataSource dataSource;

    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void init() {
        System.out.println("JDBCExample postConstruct is called. datasource = " + dataSource);
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<User> queryAllUsers() {
        System.out.println("JDBCExample: queryAllUsers is called");
        final String QUERY_SQL = "SELECT * FROM USER ORDER BY IDUSER";
        List<User> userList = this.jdbcTemplate.query(QUERY_SQL, new RowMapper<User>() {
            public User mapRow(ResultSet resulSet, int rowNum) throws SQLException {
                User user = new User();
                user.setIdUser(resulSet.getInt("IDUSER"));
                user.setUsername(resulSet.getString("USERNAME"));
                user.setPassword(resulSet.getString("PASSWORD"));
                user.setEnabled(resulSet.getBoolean("ENABLED"));
                return user;
            }
        });
        return userList;
    }
}
