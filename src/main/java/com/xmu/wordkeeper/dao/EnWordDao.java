package com.xmu.wordkeeper.dao;

import com.xmu.wordkeeper.domain.EnWord;
import com.xmu.wordkeeper.mapper.EnWordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author linlianhui
 * @date 2020/02/12
 */
@Repository
public class EnWordDao {

    @Autowired
    private EnWordMapper enWordMapper;

    /**
     * 添加 EnWord
     *
     * @param enWord 待添加单词
     * @return 操作状态码
     */
    public int insertEnWord(EnWord enWord)
    {
        return enWordMapper.insertEnWord(enWord);
    }

    /**
     * 删除 EnWord
     *
     * @param id 主键
     * @return 操作状态码
     */
    public int deleteEnWordById(Integer id)
    {
        //TODO: 暂无该方法
        return 0;
    }

    /**
     * 更新 EnWord
     *
     * @param enWord 待更新单词
     * @return 操作状态码
     */
    public int updateEnWord(EnWord enWord)
    {
        //TODO: 暂无该方法
        return 0;
    }

    /**
     * 通过主键查询 EnWord
     *
     * @param word 主键
     * @return EnWord
     */
    public EnWord selectEnWordById(String word)
    {
        return enWordMapper.selectEnWordById(word);
    }

    /**
     * 查询所有 EnWord
     *
     * @return EnWord列表
     */
    public List<EnWord> selectAllEnWords()
    {
        return enWordMapper.selectAllEnWords();
    }
}
