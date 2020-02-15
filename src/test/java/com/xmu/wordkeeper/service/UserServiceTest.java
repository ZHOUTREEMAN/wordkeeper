package com.xmu.wordkeeper.service;

import com.xmu.wordkeeper.dao.UserDao;
import com.xmu.wordkeeper.domain.User;
import com.xmu.wordkeeper.util.MD5Util;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    public void test1()
    {
        User user=new User();
        user.setName("Zhoux");
        user.setPassw("123456");
        user.setEmail("2615151@qq.com");
        user.setTel("1566666666");
        System.out.println(userService.register(user));
    }
    @Test
    public void test2()
    {
        System.out.println(userService.login("Zhoux","151515"));
    }
    @Test
    public void test3()
    {
        System.out.println(userService.findUser(1).toString());
    }
    @Test
    public void test4()
    {
        System.out.println(userService.findUserList().toString());
    }
    @Test
    public void test5()
    {
        User user=new User();
        user.setId(1);
        user.setPassw("151515");
        System.out.println(userService.UpdateUser(user));
    }
    @Test
    public void test6()
    {
        System.out.println(userService.delUser(1));
    }



}
