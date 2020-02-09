package com.xmu.wordkeeper.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import com.xmu.wordkeeper.util.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import com.xmu.wordkeeper.service.*;


@RestController
@RequestMapping("")
@Validated
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Object login(HttpServletRequest request,
                        @RequestParam String userame,
                        @RequestParam String passW)
    {
        int result=userService.login(userame,passW);
        if(result==1)
            return ResponseUtil.ok();
        else
            return ResponseUtil.fail();
    }

    @PostMapping("/register")
    public Object register(@RequestBody User user)
    {
        User result=userService.register(user);
        if(result==null)
            return ResponseUtil.fail();
        else
            return ResponseUtil.ok(result);
    }

    @PutMapping("/user/set")
    public Object setUser(@RequestBody User user)
    {
        int result=userService.UpdateUser(user);
        if(result==1)
            return ResponseUtil.ok(user);
        else
            return ResponseUtil.fail();
    }

    @GetMapping("/user")
    public Object findUser(@RequestParam Integer userId)
    {

    }


}
