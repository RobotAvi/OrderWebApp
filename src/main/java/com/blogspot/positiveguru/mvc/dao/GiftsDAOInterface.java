package com.blogspot.positiveguru.mvc.dao;

import com.blogspot.positiveguru.mvc.bean.Gift;

import java.util.List;


public interface GiftsDAOInterface {

    List<Gift> queryAllGifts();
    int addGifts(String giftName, String description);
    int queryGifts();
    int updateGift(int idGift, String giftName, String description);
    int removeGift(int idGift);

}
