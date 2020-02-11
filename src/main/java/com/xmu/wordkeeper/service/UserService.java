package com.xmu.wordkeeper.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.TinyBitSet;
import org.springframework.stereotype.Service;
import com.xmu.wordkeeper.domain.*;

import java.security.PublicKey;
import java.util.List;

/**
 * @author 32920
 */
@Service
public interface UserService {
    /**
     * 登录
     * @param userName
     * @param passW
     * @return
     */
    public int login(String userName,String passW);

    /**
     * 注册
     * @param user
     * @return
     */
    public User register(User user);

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    public User UpdateUser(User user);

    /**
     * 寻找用户信息
     * @param id
     * @return
     */
    public User findUser(Integer id);

    /**
     * 寻找用户列表
     * @return
     */
    public List<User> findUserList();

    /**
     * 删除用户
     * @param id
     * @return
     */
    public int delUser(Integer id);

}
