package com.blogspot.positiveguru.mvc.dao;


import com.blogspot.positiveguru.mvc.bean.Gift;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.List;

@Repository
public class Gifts implements GiftsDAOInterface {

    @Autowired
    DataSource dataSource;

    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void init() {
        System.out.println("Gifts postConstruct is called. datasource = " + dataSource);
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Gift> queryAllGifts() {
        System.out.println("Gifts: queryAllGifts is called");
        final String QUERY_SQL = "SELECT * FROM GIFTS ORDER BY IDGIFT";
        List<Gift> GiftList = this.jdbcTemplate.query(QUERY_SQL, (resultSet, rowNum) -> {
            Gift Gift = new Gift();
            Gift.setIdGift(resultSet.getInt("IDGIFT"));
            Gift.setGiftName(resultSet.getString("GiftNAME"));
            Gift.setDescription(resultSet.getString("Description"));
            return Gift;
        });
        return GiftList;
    }

    @Override
    public int addGifts(String giftName, String description) {
        return 0;
    }

    @Override
    public int queryGifts() {
        return 0;
    }

    @Override
    public int updateGift(int idGift, String giftName, String description) {
        return 0;
    }

    @Override
    public int removeGift(int idGift) {
        System.out.println("Gifts: queryAllGifts is called");
        final String DELETE_SQL = "DELETE * FROM Gift WHERE IDGift=?";
        int result = this.jdbcTemplate.update(DELETE_SQL, new Object[]{idGift} );

        return result;
    }
}
