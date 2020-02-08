package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;

/**
 * 商品相关接口
 */
public interface ItemService {
    /**
     * 根据每页页码和每页行数查询
     * @param page
     * @param rows
     * @return
     */
    public EasyUIDataGridResult getItemList(Integer page,Integer rows);
}
