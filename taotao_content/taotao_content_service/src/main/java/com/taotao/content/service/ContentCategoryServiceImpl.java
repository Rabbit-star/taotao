package com.taotao.content.service;

import com.taotao.common.pojo.EasyUITreeNode;
import com.taotao.mapper.TbContentCategoryMapper;
import com.taotao.pojo.TbContentCategory;
import com.taotao.pojo.TbContentCategoryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassnameContentCategoryServiceImpl
 * @Description TODO
 * @Date 2020/2/16 16:53
 * @Created by Mr.rabbit
 */
@Service
public class ContentCategoryServiceImpl implements ContentCategoryService {
@Autowired
private TbContentCategoryMapper tbContentCategoryMapper;

    @Override
    public List<EasyUITreeNode> getCategoryList(Long parentId) {
        //注入Mapper

        //创建example
        TbContentCategoryExample example = new TbContentCategoryExample();

        //设置查询条件
        TbContentCategoryExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        //执行查询
        List<TbContentCategory> tbContentCategories = tbContentCategoryMapper.selectByExample(example);

        //转成EasyUITreeNode
        List<EasyUITreeNode> nodes = new ArrayList<>();
        for (TbContentCategory tbContentCategory : tbContentCategories) {
            EasyUITreeNode node = new EasyUITreeNode();
            node.setId(tbContentCategory.getId());
            node.setText(tbContentCategory.getName());
            node.setState(tbContentCategory.getIsParent()?"closed":"open");
            nodes.add(node);
        }    
        //返回
        return nodes;
    }
}
