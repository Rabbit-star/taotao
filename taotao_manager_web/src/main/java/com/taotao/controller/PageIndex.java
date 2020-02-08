package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassnamePageIndex
 * @Description TODO
 * @Date 2020/2/7 1:13
 * @Created by Mr.rabbit
 */
@Controller
public class PageIndex {
    @RequestMapping("/")
    public String ShowIndex(){

    return "index";
    }
    @RequestMapping("/{page}")
    public String ShowPage(@PathVariable String page){

    return page;
    }

}
