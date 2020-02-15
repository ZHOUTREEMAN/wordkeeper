package com.xmu.wordkeeper.service.serviceImpl;

import com.xmu.wordkeeper.dao.EnWordDao;
import com.xmu.wordkeeper.domain.EnWord;
import com.xmu.wordkeeper.service.EnWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 32920
 */
@Service
public class EnWordServiceImpl implements EnWordService {
    @Autowired
    private EnWordDao enWordDao;
    @Override
    public List<EnWord> getWords(Integer size, Integer userId) {
        //TODO:此处待完善，以确保每次随机到的单词不同。可以利用userId?
        return enWordDao.selectAllEnWords(size);
    }

    @Override
    public EnWord getWord(String word) {
        return enWordDao.selectEnWordById(word);
    }

    @Override
    public int insertWord(EnWord word) {
        return enWordDao.insertEnWord(word);
    }
}
