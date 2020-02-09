package com.xmu.wordkeeper.dao;

import com.xmu.wordkeeper.domain.WordBook;
import com.xmu.wordkeeper.mapper.WordBookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author linlianhui
 * @date 2020/02/09
 */
@Repository
public class WordBookDao {

    @Autowired
    private WordBookMapper wordBookMapper;

    /**
     * 添加 WordBook
     *
     * @param wordBook 待添加单词书
     * @return 操作状态码
     */
    int insertWordBook(WordBook wordBook)
    {
        wordBook.setGmtCreate(LocalDateTime.now());
        wordBook.setGmtModified(LocalDateTime.now());
        wordBook.setIsDeleted(false);

        return wordBookMapper.insertWordBook(wordBook);
    }

    /**
     * 删除 WordBook
     *
     * @param id 主键
     * @return 操作状态码
     */
    int deleteWordBookById(Integer id)
    {
        WordBook wordBook = wordBookMapper.selectWordBookById(id);
        if(null != wordBook)
        {
            wordBook.setGmtModified(LocalDateTime.now());
            wordBookMapper.updateWordBook(wordBook);
        }

        return wordBookMapper.deleteWordBookById(id);
    }

    /**
     * 更新 WordBook
     *
     * @param wordBook 待更新单词书
     * @return 操作状态码
     */
    int updateWordBook(WordBook wordBook)
    {
        WordBook temp = wordBookMapper.selectWordBookById(wordBook.getId());
        if(null != temp)
        {
            wordBook.setGmtCreate(temp.getGmtCreate());
            wordBook.setGmtModified(LocalDateTime.now());
        }

        return wordBookMapper.updateWordBook(wordBook);
    }

    /**
     * 通过主键查询 WordBook
     *
     * @param id 主键
     * @return WordBook
     */
    WordBook selectWordBookById(Integer id)
    {
        return wordBookMapper.selectWordBookById(id);
    }

    /**
     * 查询所有 WordBook
     *
     * @return WordBook列表
     */
    List<WordBook> selectAllWordBooks()
    {
        return wordBookMapper.selectAllWordBooks();
    }
}
