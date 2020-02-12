package com.xmu.wordkeeper.mapper;

import com.xmu.wordkeeper.domain.EnWord;
import com.xmu.wordkeeper.domain.Punch;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * EnWord 映射类
 *
 * @author linlianhui
 * @date 2020/02/12
 */
@Mapper
@Component
public interface EnWordMapper {

    /**
     * 添加 enWord
     *
     * @param enWord 待插入 enWord
     * @return 操作状态码
     */
    int insertEnWord(EnWord enWord);

    /**
     * 删除 EnWord
     *
     * @param id 主键
     * @return 操作状态码
     */
    int deleteEnWordById(Integer id);

    /**
     * 更新 EnWord
     *
     * @param enWord 待更新 enWord
     * @return 操作状态码
     */
    int updateEnWord(EnWord enWord);

    /**
     * 通过主键查询 EnWord
     *
     * @param word 主键
     * @return EnWord
     */
    EnWord selectEnWordById(String word);

    /**
     * 查询所有 EnWord
     *
     * @return EnWord列表
     */
    List<EnWord> selectAllEnWords();
}
