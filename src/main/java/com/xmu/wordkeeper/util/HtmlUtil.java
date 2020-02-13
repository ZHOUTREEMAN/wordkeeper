package com.xmu.wordkeeper.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 32920
 * html正则匹配工具类
 */
public class HtmlUtil {
    public static String getInfo(String html,String rule)
    {
        String content = html;
        //设置匹配规则
        //String regStr = "<p.*>(.*)</p>";
        String regStr=rule;
        Pattern pattern = Pattern.compile(regStr);
        while (content != null) {
            Matcher m = pattern.matcher(content);
            if (m.find()) {
                return m.group(1);
            }
        }
        return null;
    }

}
