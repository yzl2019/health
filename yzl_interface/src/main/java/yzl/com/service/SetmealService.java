package yzl.com.service;



import yzl.com.entity.PageResult;
import yzl.com.pojo.Setmeal;

import java.util.List;

public interface SetmealService {
    void add(Setmeal setmeal, Integer[] checkgroupIds);

    PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString);

    List<Setmeal> findAll();

    Setmeal findById(Integer id);

    List<Integer> findCheckgroupsBySetmealId(int id);

    void updataAndcheckgroupIds(Integer[] checkgroupIds, Setmeal setmeal);

    void deleteById(int id);
}
