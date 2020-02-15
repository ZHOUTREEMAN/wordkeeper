package com.xmu.wordkeeper.service;

import org.springframework.stereotype.Service;

/**
 * @author 32920
 */
@Service
public interface FunctionService {
    /**
     *根据单词生成图片
     * @param word
     * @return
     */
    public String picsGen(String word);

    /**
     * 字典查询
     * @param type
     * @param word
     * @return
     */
    public String getDic(Integer type,String word);

    /**
     * 获取推送的文章
     * @return 返回的文章是带有html标签的
     */
    public String getEssay();
}

