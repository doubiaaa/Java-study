package com.kuang.money;

import com.kuang.service.BillsServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MoneyApplicationTests {
    @Autowired
    private BillsServiceImpl billsService;
    @Test
    void contextLoads() {
        billsService.list().forEach(System.out::print);
    }

}
