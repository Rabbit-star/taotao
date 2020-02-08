package com.taotao.service.impl;

import com.taotao.mapper.TestMapper;
import com.taotao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassnameTestServiceImpl
 * @Description TODO
 * 接口实现类（测试）
 * @Date 2020/2/4 22:56
 * @Created by Mr.rabbit
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testmapper;

    @Override
    public String queryNow() {
        //注入mapper
        //返回
        return testmapper.queryNow();
    }
}
