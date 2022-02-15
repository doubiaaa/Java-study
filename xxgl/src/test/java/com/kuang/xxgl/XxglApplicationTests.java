package com.kuang.xxgl;

import com.kuang.entity.Standard;
import com.kuang.service.StandardServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class XxglApplicationTests {
    @Autowired
    private StandardServiceImpl standardService;
    @Test
    void contextLoads() {
        List<Standard> list = standardService.list();
        System.out.println(list);
    }

}
