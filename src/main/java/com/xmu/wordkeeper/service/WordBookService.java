package com.xmu.wordkeeper.service;

import com.xmu.wordkeeper.domain.WordBook;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WordBookService {
    public WordBook addWordBook(WordBook wordBook);
    public int delWordBook(Integer id);
    public WordBook setWordBook(WordBook wordBook);
    public WordBook findWordBook(Integer id);
    public List<WordBook> findWordBookList(Integer userId);
}
