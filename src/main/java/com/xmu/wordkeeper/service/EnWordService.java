package com.xmu.wordkeeper.service;

import com.xmu.wordkeeper.domain.EnWord;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 32920
 */
@Service
public interface EnWordService {

    /**
     * 随机生成单词组，且每次不会重复。
     *
     * @param size
     * @param userId
     * @return
     */
    public List<EnWord> getWords(Integer size,Integer userId);

    /**
     * 查找特定单词
     * @param word
     * @return
     */
    public EnWord getWord(String word);

    /**
     * 单词库新建词条
     * @param word
     * @return
     */
    public int insertWord(EnWord word);

}
