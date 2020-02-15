package com.xmu.wordkeeper.service.serviceImpl;

import com.xmu.wordkeeper.service.FunctionService;
import com.xmu.wordkeeper.util.*;
import org.springframework.stereotype.Service;

/**
 * @author 32920
 */
@Service
public class FunctionServiceImpl implements FunctionService {
    @Override
    public String picsGen(String word) {
        try {
            String result = InternetPicsUtil.findImage(word, "", 1).get(1).getUrl();
            return result;
        }
        catch (Exception e)
        {
            return null;
        }
    }

    @Override
    public String getDic(Integer type, String word) {
        if(type==1)
        {
            return  WordUtil.getYoudaoDic(word);
        }
        else
        {
            return WordUtil.getBinyinDic(word);
        }
    }

    @Override
    public String getEssay() {
        return WordUtil.getEssay();
    }
}
