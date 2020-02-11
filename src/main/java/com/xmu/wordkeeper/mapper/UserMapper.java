package com.xmu.wordkeeper.mapper;

import com.xmu.wordkeeper.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * User 映射类
 *
 * @author linlianhui
 * @date 2020/02/09
 */
@Mapper
@Component
public interface UserMapper {

    /**
     * 添加 User
     *
     * @param user 待添加用户
     * @return 操作状态码
     */
    int insertUser(User user);

    /**
     * 删除 User
     *
     * @param id 主键
     * @return 操作状态码
     */
    int deleteUserById(Integer id);

    /**
     * 更新 User
     *
     * @param user 待更新用户
     * @return 操作状态码
     */
    int updateUser(User user);

    /**
     * 通过主键查询 User
     *
     * @param id 主键
     * @return User
     */
    User selectUserById(Integer id);
    /**
     * 通过用户名查询 User
     *
     * @param name 用户名
     * @return User
     */
    User selectUserByName(String name);

    /**
     * 查询所有 User
     *
     * @return User列表
     */
    List<User> selectAllUsers();
}
