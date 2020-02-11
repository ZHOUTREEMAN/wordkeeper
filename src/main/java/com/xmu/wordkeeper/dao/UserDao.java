package com.xmu.wordkeeper.dao;

import com.xmu.wordkeeper.domain.User;
import com.xmu.wordkeeper.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author linlianhui
 * @date 2020/02/09
 */
@Repository
public class UserDao {

    @Autowired
    private UserMapper userMapper;

    /**
     * 添加 User
     *
     * @param user 待添加用户
     * @return 操作状态码
     */
    public int insertUser(User user)
    {
        user.setGmtCreate(LocalDateTime.now());
        user.setGmtModified(LocalDateTime.now());
        user.setIsDeleted(false);

        return userMapper.insertUser(user);
    }

    /**
     * 删除 User
     *
     * @param id 主键
     * @return 操作状态码
     */
    public int deleteUserById(Integer id)
    {
        User user = userMapper.selectUserById(id);
        if(null != user)
        {
            user.setGmtModified(LocalDateTime.now());
            userMapper.updateUser(user);
        }

        return userMapper.deleteUserById(id);
    }

    /**
     * 更新 User
     *
     * @param user 待更新用户
     * @return 操作状态码
     */
    public int updateUser(User user)
    {
        User temp = userMapper.selectUserById(user.getId());
        if(null != temp)
        {
            user.setGmtCreate(temp.getGmtCreate());
            user.setGmtModified(LocalDateTime.now());
        }

        return userMapper.updateUser(user);
    }

    /**
     * 通过主键查询 User
     *
     * @param id 主键
     * @return User
     */
    public User selectUserById(Integer id)
    {
        return userMapper.selectUserById(id);
    }
    /**
     * 通过用户名查询 User
     *
     * @param name 用户名
     * @return User
     */
    public User selectUserByName(String name){return userMapper.selectUserByName(name);}

    /**
     * 查询所有 User
     *
     * @return User列表
     */
    public List<User> selectAllUsers()
    {
        return userMapper.selectAllUsers();
    }
}
