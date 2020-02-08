package com.taotao.common.pojo;


import java.io.Serializable;
import java.util.List;

/**
 * @ClassnameEasyUIDataGridResult
 * @Description TODO
 * @Date 2020/2/8 3:38
 * @Created by Mr.rabbit
 */
public class EasyUIDataGridResult implements Serializable {
    private Integer total;
    private List<?> Rows;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<?> getRows() {
        return Rows;
    }

    public void setRows(List<?> rows) {
        Rows = rows;
    }
}
