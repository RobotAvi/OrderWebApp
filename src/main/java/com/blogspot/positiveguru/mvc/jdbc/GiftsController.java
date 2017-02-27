package com.blogspot.positiveguru.mvc.jdbc;

import com.blogspot.positiveguru.mvc.bean.Gift;
import com.blogspot.positiveguru.mvc.dao.Gifts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class GiftsController {

    @Autowired
    Gifts gifts;

    @RequestMapping(value = "/jdbcQueryAllGifts", method = RequestMethod.POST)
    public ModelAndView jdbcSelectAllGifts() {
        System.out.println("Called jdbcQueryAllGifts()");
        List<Gift> giftList = gifts.queryAllGifts();
        return new ModelAndView("/jdbc/Gifts", "resultObject", giftList);
    }




}
