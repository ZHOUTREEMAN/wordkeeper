package com.xmu.wordkeeper.service.serviceImpl;

import com.xmu.wordkeeper.dao.UserDao;
import com.xmu.wordkeeper.domain.User;
import com.xmu.wordkeeper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import com.xmu.wordkeeper.util.*;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public int login(String userName, String passW) {
        User result=userDao.selectUserByName(userName);
        if(result==null)
            return 0;
        else
        {
            if(MD5Util.encrypt(passW)==result.getPassw())
                return 1;
            else
                return 0;
        }
    }

    @Override
    public User register(User user) {
        User temp=userDao.selectUserByName(user.getName());
        if(temp==null)//该用户名未注册过
        {
            user.setPassw(MD5Util.encrypt(user.getPassw()));//密码加密存储
            int result=userDao.insertUser(user);
            if(result==1)
                return user;
            else
                return null;
        }
        else
            return null;
    }


    @Override
    public User UpdateUser(User user) {
        int result=userDao.updateUser(user);
        if(result==1)
            return user;
        else
            return null;
    }

    @Override
    public User findUser(Integer id) {
        return userDao.selectUserById(id);
    }

    @Override
    public List<User> findUserList() {
        return userDao.selectAllUsers();
    }

    @Override
    public int delUser(Integer id) {
        return userDao.deleteUserById(id);
    }
}
