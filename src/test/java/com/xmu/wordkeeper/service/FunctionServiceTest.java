package com.xmu.wordkeeper.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FunctionServiceTest {
    @Autowired
    private FunctionService functionService;
    @Test
    public void test1()
    {
        System.out.println(functionService.getEssay());
    }
    @Test
    public void test2()
    {
        System.out.println(functionService.getDic(1,"university"));
        System.out.println(functionService.getDic(2,"book"));
    }
    @Test
    public void test3()
    {
        System.out.println(functionService.picsGen("厦门大学"));
    }
}