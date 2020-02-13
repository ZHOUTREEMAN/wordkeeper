package com.xmu.wordkeeper.util;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * @author 32920
 * 关于单词的一些工具类
 */
public class WordUtil {
    /**
     * 输入英文单词
     * 获取单词的发音
     * @param word
     * @return
     */
    public static String GetWordPronunciation(String word)
    {
        String pronunciation = "";
        String url="http://cn.bing.com/dict/search";
        String p="q="+word;
        String result = HttpRequestUtil.sendGet(url,p);
        pronunciation =WordUtil.getImgSrc(result).get(0);
        Matcher m = compile("美\\[.*\\]，英\\[.*\\]").matcher(pronunciation);
        m.find();
        System.out.println(m.group(0));
        return m.group(0);
    }

    /**
     * 只能输入英文单词，且结果较为详细
     * 必应词典查词
     * @param word
     * @return
     */
    public static String getBinyinDic(String word)
    {
        String r="";
        String url="http://cn.bing.com/dict/search";
        String p="q="+word;
        String result = HttpRequestUtil.sendGet(url,p);
        r =WordUtil.getImgSrc(result).get(0);
        Matcher m = compile("\".*\"").matcher(r);
        m.find();
        r=m.group(0).substring(1,m.group(0).length()-1);
        System.out.println(r);
        return r;

    }

    /**
     *
     * 获取英文阅读
     * @return
     */
    public static String getEssay()
    {
        //TODO:待实现，没找到好的英文文章接口
        int max=29610,min=1;
        int ran2 = (int) (Math.random()*(max-min)+min);
        //int a=Math.random();
        String r="";
        String url="http://en-brief.xiao84.com/201808/29610.html";
        return null;
    }

    /**
     * 中英文都可查询，结果较为简单
     * 有道词典查词
     * @param word
     * @return
     */
    public static String getYoudaoDic(String word)
    {
        String r="";
        String url="http://fanyi.youdao.com/translate";
        String p="&doctype=json&type=AUTO&i="+word;
        String result = HttpRequestUtil.sendGet(url,p);
        Matcher m = compile("tgt\":\".*\"").matcher(result);
        m.find();
        r=m.group(0).substring(6,m.group(0).length()-1);
        System.out.println(r);
        return r;
    }

    /**
     * 内部函数
     * @param htmlStr
     * @return
     */
    private static List<String> getImgSrc(String htmlStr) {
        String img = "";
        Pattern p_image;
        Matcher m_image;
        Matcher m;
        List<String> pics = new ArrayList<String>();
        String regEx_img = "<meta name=\"description\".*content\\s*=\\s*(.*?)[^>]*?><meta";
        p_image = compile(regEx_img, Pattern.CASE_INSENSITIVE);
        m_image = p_image.matcher(htmlStr);
        while (m_image.find()) {
            img =m_image.group();
            System.out.println(img);
            m = compile("content\\s*=\\s*.*\\s*\"").matcher(img);
            while (m.find()) {
                pics.add(m.group(0));
            }
        }
        return pics;
    }
    public static void main(String[] args) {
        //WordUtil.GetWordPronunciation("small");
        //WordUtil.getBinyinDic("big");
        WordUtil.getYoudaoDic("小");
    }
}
