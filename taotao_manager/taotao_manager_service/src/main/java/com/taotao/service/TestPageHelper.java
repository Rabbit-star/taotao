package com.taotao.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

/**
 * @ClassnameTestPageHelper
 * @Description TODO
 * @Date 2020/2/7 20:53
 * @Created by Mr.rabbit
 */
public class TestPageHelper {
  @Test
    public void test(){
        //初始化spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/spring/applicationContext-dao.xml");
        //获取mapper的代理对象
        TbItemMapper itemMapper = context.getBean(TbItemMapper.class);
        //设置分页信息
        PageHelper.startPage(6,100);//紧跟着的第一个查询才会被分页
        //设置mapper的查询条件
        TbItemExample itemExample = new TbItemExample();

        List<TbItem> tbItems1 = itemMapper.selectByExample(itemExample);
        List<TbItem> tbItems2 = itemMapper.selectByExample(itemExample);
        //取分页信息
      PageInfo<TbItem> info = new PageInfo<>(tbItems1);
      System.out.println("tbItem1的个数"+tbItems1.size());
      System.out.println("tbItem2的个数"+tbItems2.size());
      System.out.println("查询总记录数："+info.getTotal());

        for (TbItem t:tbItems1
             ) {
            System.out.println(t.getId()+" >>>> "+t.getTitle());
        }

    }

}
