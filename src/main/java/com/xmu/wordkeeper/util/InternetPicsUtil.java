package com.xmu.wordkeeper.util;
import java.util.ArrayList;
import org.apache.commons.lang3.StringEscapeUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.xmu.wordkeeper.domain.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.util.List;

/**
 * @author 32920
 */
public class InternetPicsUtil {
    private static List<JsoupImageVO> findImageNoURl(String hotelId, String url, int timeOut) {
        List<JsoupImageVO> result = new ArrayList<JsoupImageVO>();
        Document document = null;
        try {
            document = Jsoup.connect(url).data("query", "Java")//请求参数
                    .userAgent("Mozilla/4.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0)")//设置urer-agent get();
                    .timeout(timeOut)
                    .get();
            String xmlSource = document.toString();
            result = dealResult(xmlSource, hotelId);
        } catch (Exception e) {
            String defaultURL = "http://qnimg.zowoyoo.com/img/15463/1509533934407.jpg";
            result = dealResult(defaultURL,hotelId);
        }
        return result;
    }
    public static List<JsoupImageVO> findImage(String hotelName, String hotelId, int page) {
        int number=5;
        String url = "http://image.baidu.com/search/avatarjson?tn=resultjsonavatarnew&ie=utf-8&word=" + hotelName + "&cg=star&pn=" + page * 30 + "&rn="+number+"&itg=0&z=0&fr=&width=&height=&lm=-1&ic=0&s=0&st=-1&gsm=" + Integer.toHexString(page * 30);
        int timeOut = 5000;
        return findImageNoURl(hotelId, url, timeOut);
    }
    private static List<JsoupImageVO> dealResult(String xmlSource, String hotelId) {
        List<JsoupImageVO> result = new ArrayList<JsoupImageVO>();
        xmlSource = StringEscapeUtils.unescapeHtml3(xmlSource);
        String reg = "objURL\":\"http://.+?\\.(gif|jpeg|png|jpg|bmp)";
        Pattern pattern = Pattern.compile(reg);
        Matcher m = pattern.matcher(xmlSource);
        while (m.find()) {
            JsoupImageVO jsoupImageVO = new JsoupImageVO();
            String imageURL = m.group().substring(9);
            if(imageURL==null || "".equals(imageURL)){
                String defaultURL = "http://qnimg.zowoyoo.com/img/15463/1509533934407.jpg";
                jsoupImageVO.setUrl(defaultURL);
            }else{
                jsoupImageVO.setUrl(imageURL);
            }
            jsoupImageVO.setName(hotelId);
            result.add(jsoupImageVO);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(findImage("phone","",1).get(1).getUrl());
    }
}