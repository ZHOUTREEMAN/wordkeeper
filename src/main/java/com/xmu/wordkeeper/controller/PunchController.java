package com.xmu.wordkeeper.controller;
import com.xmu.wordkeeper.service.PunchService;
import com.xmu.wordkeeper.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import com.xmu.wordkeeper.domain.*;

import javax.servlet.http.HttpServletRequest;


/**
 * @author 32920
 */
@RestController
@RequestMapping("")
@Validated
@CrossOrigin
public class PunchController {
    @Autowired
    private PunchService punchService;

    @PostMapping("/punch")
    public Object newPunch(HttpServletRequest request,@RequestBody Punch punch)
    {
        Punch result=punchService.addPunch(punch);
        if(result==null) {
            return ResponseUtil.fail();
        } else {
            return ResponseUtil.ok(result);
        }
    }

    @DeleteMapping("/punch")
    public Object delPunch(@RequestParam Integer id)
    {
        int result=punchService.delPunch(id);
        if(result==1) {
            return ResponseUtil.ok();
        } else {
            return ResponseUtil.fail();
        }
    }

    @PutMapping("/punch")
    public Object setPunch(@RequestBody Punch punch)
    {
        Punch result=punchService.setPunch(punch);
        if(result!=null) {
            return ResponseUtil.ok(result);
        } else {
            return ResponseUtil.fail();
        }
    }

    @GetMapping("/punch/{id}")
    public Object findPunch(@PathVariable Integer id)
    {
        Punch result= punchService.findPunch(id);
        if(result==null) {
            return ResponseUtil.fail();
        } else {
            return ResponseUtil.ok(result);
        }
    }

    @GetMapping("/punchlist")
    public Object findPunchList(@RequestParam Integer userId)
    {
       return ResponseUtil.ok(punchService.findPunchList(userId));
    }

}
