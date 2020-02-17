package com.xmu.wordkeeper.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        String originalResult = functionService.getDic(2, "book");
        String result = originalResult.substring(originalResult.indexOf("，")+1, originalResult.length()-1);
        //System.out.println(result);
        Pattern rule = Pattern.compile("[a-z]+\\.\\s");
        Matcher matcher = rule.matcher(result);
        int start = 0;
        while (matcher.find()) {
            System.out.println(result.substring(start, matcher.start()-1));
            start = matcher.start();
        }
        System.out.println(result.substring(start, result.length()));
    }
    @Test
    public void test3()
    {
        System.out.println(functionService.picsGen("厦门大学"));
    }
}