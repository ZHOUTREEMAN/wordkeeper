package com.xmu.wordkeeper.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EnWordServiceTest {
    @Autowired
    private EnWordService enWordService;
    @Test
    public void test1()
    {
        System.out.println(enWordService.getWords(5,5).toString());
    }
    @Test
    public void test2()
    {
        System.out.println(enWordService.getWord("school").toString());
    }
}