package yzl.com.service;



import yzl.com.entity.PageResult;
import yzl.com.pojo.CheckItem;

import java.util.List;

public interface CheckItemServcie {

    /**
     * 新增
     * @param checkItem
     */
    void add(CheckItem checkItem);

    /**
     * 分页
     * @param currentPage
     * @param pageSize
     * @param queryString
     * @return
     */
    PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString);

    /**
     * 删除
     */
    void delete(Integer id);

    /**
     * 编辑
     */
    void edit(CheckItem checkItem);

    /**
     * 查询所有检查项
     */
    List<CheckItem> findAll();
}
