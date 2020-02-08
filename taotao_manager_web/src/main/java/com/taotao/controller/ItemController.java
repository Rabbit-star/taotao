package com.taotao.controller;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassnameItemController
 * @Description TODO
 * @Date 2020/2/8 3:55
 * @Created by Mr.rabbit
 */
@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;
    //url:/item/list
    //method:get
    //参数：page,rows
    //返回值：json
    @RequestMapping(value = "/item/list",method = RequestMethod.GET)
    @ResponseBody
    public EasyUIDataGridResult getItemList(Integer page,Integer rows){
        //引入服务

        //调用服务
        EasyUIDataGridResult itemList = itemService.getItemList(page, rows);

        //返回
        return itemList;



    }

}
