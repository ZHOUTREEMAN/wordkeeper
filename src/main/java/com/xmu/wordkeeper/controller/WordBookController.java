package com.xmu.wordkeeper.controller;
import com.xmu.wordkeeper.domain.WordBook;
import com.xmu.wordkeeper.service.*;
import com.xmu.wordkeeper.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * @author 32920
 */
@RestController
@RequestMapping("")
@Validated
public class WordBookController {
    @Autowired
    private WordBookService wordBookService;

    @PostMapping("/wordbook")
    public Object newWordBook(HttpServletRequest request, @RequestBody WordBook wordBook)
    {
        WordBook result=wordBookService.addWordBook(wordBook);
        if(result==null) {
            return ResponseUtil.fail();
        } else {
            return ResponseUtil.ok(result);
        }
    }

    @DeleteMapping("/wordbook")
    public Object delWordBook(@RequestParam Integer id)
    {
        int result=wordBookService.delWordBook(id);
        if(result==1) {
            return ResponseUtil.ok();
        } else {
            return ResponseUtil.fail();
        }
    }

    @PutMapping("/wordbook")
    public Object setWordBook(@RequestBody WordBook wordBook)
    {
        WordBook result=wordBookService.setWordBook(wordBook);
        if(result==null) {
            return ResponseUtil.fail();
        } else {
            return ResponseUtil.ok(result);
        }
    }

    @GetMapping("/wordbook")
    public Object findWordBook(@RequestParam Integer id)
    {
        WordBook result=wordBookService.findWordBook(id);
        if(result==null) {
            return ResponseUtil.fail();
        } else {
            return ResponseUtil.ok(result);
        }
    }

    @GetMapping("/wordbooklist")
    public Object findWordBookList(@RequestParam Integer userId)
    {
        List<WordBook> result=wordBookService.findWordBookList(userId);
        return ResponseUtil.ok(result);
    }
}
