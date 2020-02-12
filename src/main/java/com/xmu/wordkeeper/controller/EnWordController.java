package com.xmu.wordkeeper.controller;


import com.xmu.wordkeeper.domain.EnWord;
import com.xmu.wordkeeper.service.EnWordService;
import com.xmu.wordkeeper.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Max;
import java.util.List;

/**
 * @author 32920
 */
@RestController
@RequestMapping("")
@Validated
@CrossOrigin
public class EnWordController {
    @Autowired
    private EnWordService enWordService;
    @GetMapping("/words")
    public Object getWords(@RequestParam Integer size,@RequestParam Integer userId)
    {
        List<EnWord> result=enWordService.getWords(size,userId);
        if(result.size()==0)
        {
            return ResponseUtil.fail();
        }
        else
        {
            return ResponseUtil.ok(result);
        }
    }
    @GetMapping("/words/{word}")
    public Object getWord(@PathVariable String word)
    {
        EnWord result=enWordService.getWord(word);
        if(result==null)
        {
            return ResponseUtil.fail();
        }
        else
        {
            return ResponseUtil.ok(result);
        }
    }

    @PostMapping("/words")
    public Object newWord(@RequestBody EnWord word)
    {
        int result = enWordService.insertWord(word);
        if(result==1)
        {
            return ResponseUtil.ok();
        }
        else
        {
            return ResponseUtil.fail();
        }
    }

}
