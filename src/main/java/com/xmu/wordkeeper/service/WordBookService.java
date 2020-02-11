package com.xmu.wordkeeper.service;

import com.xmu.wordkeeper.domain.WordBook;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 32920
 */
@Service
public interface WordBookService {
    /**
     * 增加生词记录
     * @param wordBook
     * @return
     */
    public WordBook addWordBook(WordBook wordBook);

    /**
     * 删除生词记录
     * @param id
     * @return
     */
    public int delWordBook(Integer id);

    /**
     * 修改生词条目
     * @param wordBook
     * @return
     */
    public WordBook setWordBook(WordBook wordBook);

    /**
     * 寻找生词记录
     * @param id
     * @return
     */
    public WordBook findWordBook(Integer id);

    /**
     * 寻找个人的生词列表
     * @param userId
     * @return
     */
    public List<WordBook> findWordBookList(Integer userId);
}
