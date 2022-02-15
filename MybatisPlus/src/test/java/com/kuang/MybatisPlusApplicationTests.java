package com.kuang;

import com.kuang.mapper.UserMapper;
import com.kuang.pojo.Standard;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {
    @Autowired(required = false)
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        List<Standard> list = userMapper.selectList(null);
        for (Standard user : list) {
            System.out.println(user);
        }
    }

}
