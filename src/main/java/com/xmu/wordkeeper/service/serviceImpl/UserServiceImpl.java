package com.xmu.wordkeeper.service.serviceImpl;

import com.xmu.wordkeeper.domain.User;
import com.xmu.wordkeeper.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public int login(String userName, String passW) {
        return 0;
    }

    @Override
    public User register(User user) {
        return null;
    }


    @Override
    public User UpdateUser(User user) {
        return null;
    }

    @Override
    public User findUser(Integer id) {
        return null;
    }

    @Override
    public List<User> findUserList() {
        return null;
    }

    @Override
    public int delUser(Integer id) {
        return 0;
    }
}
