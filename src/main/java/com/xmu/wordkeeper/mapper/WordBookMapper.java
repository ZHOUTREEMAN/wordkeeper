package com.xmu.wordkeeper.mapper;

import com.xmu.wordkeeper.domain.WordBook;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * WordBook 映射类
 *
 * @author linlianhui
 * @date 2020/02/09
 */
@Mapper
@Component
public interface WordBookMapper {

    /**
     * 添加 WordBook
     *
     * @param wordBook 待插入单词书
     * @return 操作状态码
     */
    int insertWordBook(WordBook wordBook);

    /**
     * 删除 WordBook
     *
     * @param id 主键
     * @return 操作状态码
     */
    int deleteWordBookById(Integer id);

    /**
     * 更新 WordBook
     *
     * @param wordBook 待更新单词书
     * @return 操作状态码
     */
    int updateWordBook(WordBook wordBook);

    /**
     * 通过主键查询 WordBook
     *
     * @param id 主键
     * @return WordBook
     */
    WordBook selectWordBookById(Integer id);

    /**
     * 查询所有 WordBook
     *
     * @return WordBook列表
     */
    List<WordBook> selectAllWordBooks();
}
