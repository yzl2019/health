package yzl.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yzl.com.dao.CheckItemDao;

@Service
@Transactional
public class CheckItemServiceImpl {
    @Autowired
    private CheckItemDao checkItemDao;

    public void save(){
        System.out.println(checkItemDao.selectList(null));
    }
}
