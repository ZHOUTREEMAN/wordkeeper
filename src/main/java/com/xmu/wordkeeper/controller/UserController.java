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
import com.xmu.wordkeeper.domain.*;


/**
 * @author 32920
 */
@RestController
@RequestMapping("")
@Validated
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Object login(HttpServletRequest request,
                        @RequestParam String userName,
                        @RequestParam String passW)
    {
        int result=userService.login(userName,passW);
        if(result==1) {
            return ResponseUtil.ok();
        } else {
            return ResponseUtil.fail();
        }
    }

    @PostMapping("/register")
    public Object register(@RequestBody User user)
    {
        User result=userService.register(user);
        if(result==null) {
            return ResponseUtil.fail();
        } else {
            return ResponseUtil.ok(result);
        }
    }

    @PutMapping("/user")
    public Object setUser(@RequestBody User user)
    {
        User result=userService.UpdateUser(user);
        if(result!=null) {
            return ResponseUtil.ok(result);
        } else {
            return ResponseUtil.fail();
        }
    }

    @GetMapping("/user/{userId}")
    public Object findUser(@PathVariable Integer userId)
    {
        User result=userService.findUser(userId);
        if(result!=null) {
            return ResponseUtil.ok(result);
        } else {
            return ResponseUtil.fail();
        }
    }

    @GetMapping("/userList")
    public Object findUserList()
    {
        return ResponseUtil.ok(userService.findUserList());
    }

    @DeleteMapping("/user")
    public Object delUser(@RequestParam Integer userId)
    {
        int result=userService.delUser(userId);
        if(result==1) {
            return ResponseUtil.ok();
        } else {
            return ResponseUtil.fail();
        }
    }


}
