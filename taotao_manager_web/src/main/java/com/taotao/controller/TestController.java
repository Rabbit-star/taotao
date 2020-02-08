package com.taotao.controller;

import com.taotao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassnameTestController
 * @Description TODO
 * 测试使用的Cotroller
 * @Date 2020/2/4 23:19
 * @Created by Mr.rabbit
 */
@Controller
public class TestController {
    @Autowired
    private TestService testService;
    @RequestMapping("testQueryNow")
    @ResponseBody
    public String test(){
        //引入服务
        //注入服务
        //调用服务的方法
    return testService.queryNow();
    }

}
