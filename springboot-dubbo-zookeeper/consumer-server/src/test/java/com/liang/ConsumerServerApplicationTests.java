package com.liang;

import com.liang.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ConsumerServerApplication.class)//这里要加上classes，参考博客：
    //https://blog.csdn.net/LinFord1995/article/details/108635913
class ConsumerServerApplicationTests {
    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        userService.buyTicket();
    }

}
