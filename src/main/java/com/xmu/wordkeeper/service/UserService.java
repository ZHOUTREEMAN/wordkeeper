package com.xmu.wordkeeper.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.TinyBitSet;
import org.springframework.stereotype.Service;
import com.xmu.wordkeeper.domain.*;

import java.security.PublicKey;
import java.util.List;

@Service
public interface UserService {
    public int login(String userName,String passW);
    public User register(User user);
    public User UpdateUser(User user);
    public User findUser(Integer id);
    public List<User> findUserList();
    public int delUser(Integer id);

}
