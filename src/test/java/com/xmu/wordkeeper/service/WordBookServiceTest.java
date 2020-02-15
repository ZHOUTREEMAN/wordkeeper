package com.xmu.wordkeeper.service;

import com.xmu.wordkeeper.domain.WordBook;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class WordBookServiceTest {
    @Autowired
    private WordBookService wordBookService;
    @Test
    public void test1()
    {
        WordBook wordBook=new WordBook();
        wordBook.setUserId(888);
        wordBook.setWord("xmu");
        wordBook.setParaphrase("厦门大学简写");
        wordBook.setDate(LocalDateTime.now());
        System.out.println(wordBookService.addWordBook(wordBook));
    }
    @Test
    public void test2()
    {
        System.out.println(wordBookService.findWordBook(1).toString());
    }
    @Test
    public void test3()
    {
        System.out.println(wordBookService.findWordBookList(888).toString());
    }
    @Test
    public void test4()
    {
        WordBook wordBook=new WordBook();
        wordBook.setParaphrase("中国最美大学,厦门大学简写");
        wordBook.setId(1);
        System.out.println(wordBookService.setWordBook(wordBook));
    }
    @Test
    public void test5()
    {
        System.out.println(wordBookService.delWordBook(1));
    }

}
