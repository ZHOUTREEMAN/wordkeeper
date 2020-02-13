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

    public String getDic(Integer type,String word);
}

