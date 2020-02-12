package com.xmu.wordkeeper.service.serviceImpl;

import com.xmu.wordkeeper.service.FunctionService;
import com.xmu.wordkeeper.util.*;

/**
 * @author 32920
 */
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
}
