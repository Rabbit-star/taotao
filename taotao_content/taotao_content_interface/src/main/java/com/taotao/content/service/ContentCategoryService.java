package com.taotao.content.service;

import com.taotao.common.pojo.EasyUITreeNode;

import java.util.List;

/**
 * @ClassnameContentCategoryService
 * @Description TODO
 * @Date 2020/2/16 16:49
 * @Created by Mr.rabbit
 */
public interface ContentCategoryService {
    /**
     * 通过该节点的id，查询该节点的子节点
     * @param parentId
     * @return
     */
    public List<EasyUITreeNode> getCategoryList(Long parentId);

}
