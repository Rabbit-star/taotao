package com.taotao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassnameItemServiceImpl
 * @Description TODO
 * @Date 2020/2/8 3:46
 * @Created by Mr.rabbit
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private TbItemMapper itemmapper;

    @Override
    public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
        //设置分页信息PageHelper
        if(page==null)page=1;
        if(rows==null)rows=30;
        PageHelper.startPage(page, rows);
        //注入mapper

        //创建example
        TbItemExample itemExample = new TbItemExample();
        //根据mapper调用查询方法
        List<TbItem> tbItems = itemmapper.selectByExample(itemExample);
        //获取分页信息
        PageInfo<TbItem> info = new PageInfo<>(tbItems);
        //转到EasyUIDataGridResult
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        result.setTotal((int)info.getTotal());
        result.setRows(info.getList());
        //返回EasyUIDataGridResult
        return result;
    }
}
