package com.xmu.wordkeeper.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public int login(String userName,String passW);
    public User register(User user);
    public int UpdateUser(User user);

}
