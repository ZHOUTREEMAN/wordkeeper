package com.xmu.wordkeeper.service.serviceImpl;

import com.xmu.wordkeeper.dao.WordBookDao;
import com.xmu.wordkeeper.domain.WordBook;
import com.xmu.wordkeeper.service.WordBookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 32920
 */
public class WordBookServiceImpl implements WordBookService {
    @Autowired
    private WordBookDao wordBookDao;
    @Override
    public WordBook addWordBook(WordBook wordBook) {
        int result=wordBookDao.insertWordBook(wordBook);
        if(result==1) {
            return wordBook;
        } else {
            return null;
        }
    }

    @Override
    public int delWordBook(Integer id) {
        return wordBookDao.deleteWordBookById(id);
    }

    @Override
    public WordBook setWordBook(WordBook wordBook) {
        int result=wordBookDao.updateWordBook(wordBook);
        if(result==1) {
            return wordBook;
        } else {
            return null;
        }
    }

    @Override
    public WordBook findWordBook(Integer id) {
        return wordBookDao.selectWordBookById(id);
    }

    @Override
    public List<WordBook> findWordBookList(Integer userId) {
        return wordBookDao.selectAllWordBooks(userId);
    }
}
