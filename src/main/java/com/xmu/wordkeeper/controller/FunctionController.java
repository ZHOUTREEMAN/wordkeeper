package com.xmu.wordkeeper.controller;
import com.xmu.wordkeeper.service.FunctionService;
import com.xmu.wordkeeper.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.crypto.interfaces.PBEKey;


/**
 * @author 32920
 */
@RestController
@RequestMapping("")
@Validated
public class FunctionController {
    //TODO: 无实现，暂时先注释
    //@Autowired
    //private FunctionService functionService;
    @GetMapping("/oralscore")
    public Object getOralScore()
    {
        return ResponseUtil.ok();
    }
    @GetMapping("/essayscore")
    public Object getEssayScore()
    {
        return ResponseUtil.ok();
    }
    @GetMapping("/essay")
    public Object getEssay()
    {
        return ResponseUtil.ok();
    }
    @GetMapping("/dictionary")
    public Object getDictionary()
    {
        return ResponseUtil.ok();
    }
    @GetMapping("/memoryplan")
    public Object getMemoryPlan()
    {
        return ResponseUtil.ok();
    }
    @GetMapping("/picsgen")
    public Object picsGen()
    {
        return ResponseUtil.ok();
    }
    @GetMapping("/shakespeare")
    public Object shakespeare()
    {
        return ResponseUtil.ok();
    }
    @GetMapping("/vid2speech")
    public Object  vid2speech()
    {
        return ResponseUtil.ok();
    }
}
