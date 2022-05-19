package yzl.com;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import yzl.com.service.impl.CheckItemServiceImpl;

@SpringBootTest
public class MyText {

    @Autowired
    private CheckItemServiceImpl checkItemService;
    @Test
    public void test(){
        checkItemService.save();
    }
}
