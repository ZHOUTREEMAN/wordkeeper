package com.xmu.wordkeeper.controller;
import com.xmu.wordkeeper.service.FunctionService;
import com.xmu.wordkeeper.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.crypto.interfaces.PBEKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author 32920
 */
@RestController
@RequestMapping(value = "")
@Validated
@CrossOrigin
public class FunctionController {
    @Autowired
    private FunctionService functionService;

    static Pattern rule = Pattern.compile("[a-z]+\\.\\s");
    /**
     * 获取口语的分数
     * @return
     */
    @GetMapping("/oralscore")
    public Object getOralScore()
    {
        return ResponseUtil.ok();
    }

    /**
     * 获取作文评分
     * @return
     */
    @GetMapping("/essayscore")
    public Object getEssayScore()
    {
        return ResponseUtil.ok();
    }

    /**
     * 获取推荐的阅读文章
     * @return
     */
    @GetMapping("/essay")
    public Object getEssay()
    {
        return ResponseUtil.ok(functionService.getEssay());
    }

    /**
     * 查询字典
     * @return
     */
    @GetMapping("/dictionary")
    public Object getDictionary(@RequestParam(required = false) Integer type, @RequestParam("word") String word)
    {
        type = 2;
        //查询有道词典，支持中英文互查，简单意思
        if(type==1)
        {
            return ResponseUtil.ok(functionService.getDic(1,word));
        }
        //查询有道词典，只支持英文查询，返回较为复杂的解释
        else if(type==2)
        {
            ArrayList<String> stringArrayList = new ArrayList<String>();
            String originalResult = functionService.getDic(2, word);
            String result = originalResult.substring(originalResult.indexOf("，")+1, originalResult.length()-1);

            Matcher matcher = rule.matcher(result);
            int start = 0;
            while (matcher.find()) {
                stringArrayList.add(result.substring(start, matcher.start()-1));
                start = matcher.start();
            }
            stringArrayList.add(result.substring(start, result.length()));

            return ResponseUtil.ok(stringArrayList);
        }
        else
        {
            return ResponseUtil.fail();
        }
    }

    /**
     * 获取记忆计划
     * @return
     */
    @GetMapping("/memoryplan")
    public Object getMemoryPlan()
    {
        return ResponseUtil.ok();
    }

    /**
     * 根据单词生成图片
     * @return
     */
    @GetMapping("/picsgen/{word}")
    public Object picsGen(@PathVariable String word)
    {
        String result=functionService.picsGen(word);
        if(result==null)
        {
            return ResponseUtil.fail();
        }
        else
        {
            return ResponseUtil.ok(result);
        }
    }

    /**
     * 转化成莎士比亚古典英语
     * @return
     */
    @GetMapping("/shakespeare")
    public Object shakespeare()
    {
        return ResponseUtil.ok();
    }

    /**
     * 英语配音
     * @return
     */
    @GetMapping("/vid2speech")
    public Object  vid2speech()
    {
        return ResponseUtil.ok();
    }
}
