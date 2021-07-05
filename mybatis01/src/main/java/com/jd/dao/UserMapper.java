package com.jd.dao;

import com.jd.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xielong7
 * @since 2021-06-19
 */
public interface UserMapper  {//extends BaseMapper<User>

    List<User> getUserList();

    int insertUser(User user);

    int updateUserById(User user);

    boolean deleteUserById(int userId);

    int insertUserByMap(Map<String,Object> map);

}
