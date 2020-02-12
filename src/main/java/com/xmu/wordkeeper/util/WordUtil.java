package com.xmu.wordkeeper.util;


//
//import org.springframework.boot.autoconfigure.http.HttpProperties;
//import org.springframework.web.reactive.function.client.ClientResponse;
//import org.springframework.web.reactive.function.client.WebClient;
//
//
//public class WordUtil {
//    private String GetWordPronunciation(String word)
//    {
//        String pronunciation = String.Empty();
//        WebClient wc = new WebClient();
//        wc.Encoding = HttpProperties.Encoding.UTF8;
//        String result = wc.DownloadString("http://cn.bing.com/dict/search?q=" + word);
//        String key = "英[";
//        int index = result.indexOf(key, StringComparison.Ordinal);
//        if (index == -1)
//        {
//            key = "美[";
//            index = result.indexOf(key, StringComparison.Ordinal);
//        }
//        if (index > -1)
//        {
//            int end = result.indexOf(']', index);
//            pronunciation = result.substring(index + key.length(), end - index - 2);
//        }
//        return pronunciation;
//    }
//}
