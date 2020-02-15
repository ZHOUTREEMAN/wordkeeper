package com.xmu.wordkeeper.service;

import com.xmu.wordkeeper.domain.Punch;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class PunchServiceTest {
    @Autowired
    private PunchService punchService;
    @Test
    public void test1()
    {
        Punch punch=new Punch();
        punch.setDate(LocalDateTime.now());
        punch.setNums(45);
        punch.setNums(1);
        punch.setUserId(888);
        System.out.println(punchService.addPunch(punch));
    }
    @Test
    public void test2()
    {
        System.out.println(punchService.findPunch(1).toString());
    }
    @Test
    public void test3()
    {
        System.out.println(punchService.findPunchList(888).toString());
    }
    @Test
    public void test4()
    {
        Punch punch=new Punch();
        punch.setNums(1);
        punch.setId(1);
        System.out.println(punchService.setPunch(punch).toString());
    }
    @Test
    public void test5()
    {
        System.out.println(punchService.delPunch(1));
    }

}
